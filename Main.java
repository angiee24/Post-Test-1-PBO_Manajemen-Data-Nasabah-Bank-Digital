package com.mycompany.posttest1_bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<Nasabah> daftarNasabah = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static long noRekCounter = 2025001;
    
    private static final double SALDO_MINIMUM = 50000.0;
    private static final double BIAYA_TRANSFER = 2500.0;

    static class Nasabah {
        String nomorRekening;
        String nama;
        double saldo;
        ArrayList<String> mutasiRekening;

        public Nasabah(String nomorRekening, String nama, double saldo) {
            this.nomorRekening = nomorRekening;
            this.nama = nama;
            this.saldo = saldo;
            this.mutasiRekening = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "No. Rek: " + nomorRekening + ", Nama: " + nama + ", Saldo: Rp" + String.format("%,.2f", saldo);
        }
    }

    public static void main(String[] args) {
        buatDataAwal();

        while (true) {
            tampilkanMenuUtama();
            System.out.print("Pilih menu (1-8): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1": tambahNasabah(); break;
                case "2": tampilkanSemuaNasabah(); break;
                case "3": ubahNamaNasabah(); break;
                case "4": hapusNasabah(); break;
                case "5": menuTransaksi(); break;
                case "6": lihatMutasiRekening(); break;
                case "7": cariNasabah(); break;
                case "8":
                    System.out.println("\nTerima kasih!");
                    return;
                default:
                    System.out.println("\nPilihan tidak valid, silakan coba lagi.");
                    break;
            }

            if (!pilihan.equals("5") && !pilihan.equals("8")) {
                System.out.print("\nTekan Enter untuk kembali ke menu...");
                scanner.nextLine();
            }
        }
    }

    public static void buatDataAwal() {
        Nasabah nasabah1 = new Nasabah("REK" + noRekCounter++, "Budi Santoso", 500000);
        nasabah1.mutasiRekening.add("Setoran Awal: +Rp500,000.00");
        daftarNasabah.add(nasabah1);
        
        Nasabah nasabah2 = new Nasabah("REK" + noRekCounter++, "Citra Lestari", 1200000);
        nasabah2.mutasiRekening.add("Setoran Awal: +Rp1,200,000.00");
        daftarNasabah.add(nasabah2);
    }

    public static void tampilkanMenuUtama() {
        System.out.println("\n--- Program Bank Digital ---");
        System.out.println("1. Tambah Nasabah");
        System.out.println("2. Tampilkan Nasabah");
        System.out.println("3. Ubah Nama Nasabah");
        System.out.println("4. Hapus Nasabah");
        System.out.println("5. Lakukan Transaksi");
        System.out.println("6. Lihat Mutasi Rekening");
        System.out.println("7. Cari Nasabah (Nama/No. Rek)");
        System.out.println("8. Keluar");
    }
    

    public static void tambahNasabah() {
        System.out.println("\n--- Tambah Nasabah ---");
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Setoran Awal: ");
        double saldoAwal = Double.parseDouble(scanner.nextLine());

        String noRekBaru = "REK" + noRekCounter++;
        Nasabah nasabahBaru = new Nasabah(noRekBaru, nama, saldoAwal);
        nasabahBaru.mutasiRekening.add("Setoran Awal: +Rp" + String.format("%,.2f", saldoAwal));
        daftarNasabah.add(nasabahBaru);
        System.out.println("BERHASIL: Nasabah baru ditambahkan dengan No. Rekening: " + noRekBaru);
    }

    public static void tampilkanSemuaNasabah() {
        System.out.println("\n--- Data Nasabah ---");
        if (daftarNasabah.isEmpty()) {
            System.out.println("Belum ada data nasabah.");
        } else {
            for (int i = 0; i < daftarNasabah.size(); i++) {
                System.out.println((i + 1) + ". " + daftarNasabah.get(i).toString());
            }
        }
    }

    public static void ubahNamaNasabah() {
        System.out.println("\n--- Ubah Nama Nasabah ---");
        System.out.print("Masukkan No. Rekening yang akan diubah: ");
        String noRek = scanner.nextLine();
        
        Nasabah nasabah = cariNasabahByNoRek(noRek);
        
        if (nasabah != null) {
            System.out.println("Nama saat ini: " + nasabah.nama);
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            
            nasabah.nama = namaBaru; 
            
            System.out.println("BERHASIL: Nama nasabah telah diperbarui.");
        } else {
            System.out.println("GAGAL: Rekening tidak ditemukan.");
        }
    }

    public static void hapusNasabah() {
        System.out.println("\n--- Hapus Nasabah ---");
        System.out.print("Masukkan No. Rekening yang akan dihapus: ");
        String noRek = scanner.nextLine();
        int indexDitemukan = -1;
        for (int i = 0; i < daftarNasabah.size(); i++) {
            if (daftarNasabah.get(i).nomorRekening.equals(noRek)) {
                indexDitemukan = i;
                break;
            }
        }

        if (indexDitemukan != -1) {
            daftarNasabah.remove(indexDitemukan);
            System.out.println("BERHASIL: Nasabah telah dihapus.");
        } else {
            System.out.println("GAGAL: Rekening tidak ditemukan.");
        }
    }

    public static void menuTransaksi() {
        while (true) {
            System.out.println("\n--- Menu Transaksi ---");
            System.out.println("1. Setor Tunai");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Transfer Dana");
            System.out.println("4. Kembali ke Menu Utama");
            System.out.print("Pilih jenis transaksi (1-4): ");
            String pilihan = scanner.nextLine();

            switch (pilihan) {
                case "1": setorTunai(); break;
                case "2": tarikTunai(); break;
                case "3": transferDana(); break;
                case "4": return;
                default: System.out.println("\nPilihan tidak valid."); break;
            }

            if (!pilihan.equals("4")) {
                 System.out.print("\nTekan Enter untuk melanjutkan transaksi...");
                 scanner.nextLine();
            }
        }
    }

    public static void setorTunai() {
        System.out.println("\n--- Setor Tunai ---");
        System.out.print("Masukkan No. Rekening: ");
        String noRek = scanner.nextLine();
        Nasabah nasabah = cariNasabahByNoRek(noRek);

        if (nasabah != null) {
            System.out.print("Masukkan Jumlah Setoran: ");
            double jumlah = Double.parseDouble(scanner.nextLine());
            if (jumlah < 10000) {
                System.out.println("GAGAL: Minimal setor tunai adalah Rp10.000.");
                return;
            }
            nasabah.saldo += jumlah;
            nasabah.mutasiRekening.add("Setor Tunai: +Rp" + String.format("%,.2f", jumlah));
            System.out.println("BERHASIL: Saldo baru Rp" + String.format("%,.2f", nasabah.saldo));
        } else {
            System.out.println("GAGAL: Rekening tidak ditemukan.");
        }
    }

    public static void tarikTunai() {
        System.out.println("\n--- Tarik Tunai ---");
        System.out.print("Masukkan No. Rekening: ");
        String noRek = scanner.nextLine();
        Nasabah nasabah = cariNasabahByNoRek(noRek);

        if (nasabah != null) {
            System.out.print("Masukkan Jumlah Penarikan: ");
            double jumlah = Double.parseDouble(scanner.nextLine());

            if ((nasabah.saldo - jumlah) >= SALDO_MINIMUM) {
                nasabah.saldo -= jumlah;
                nasabah.mutasiRekening.add("Tarik Tunai: -Rp" + String.format("%,.2f", jumlah));
                System.out.println("BERHASIL: Sisa saldo Rp" + String.format("%,.2f", nasabah.saldo));
            } else {
                System.out.println("GAGAL: Saldo tidak mencukupi atau akan kurang dari saldo minimum.");
            }
        } else {
            System.out.println("GAGAL: Rekening tidak ditemukan.");
        }
    }

    public static void transferDana() {
        System.out.println("\n--- Transfer Dana ---");
        System.out.print("Masukkan No. Rekening Pengirim: ");
        String noRekPengirim = scanner.nextLine();
        Nasabah pengirim = cariNasabahByNoRek(noRekPengirim);
        if (pengirim == null) {
            System.out.println("GAGAL: Rekening pengirim tidak ditemukan.");
            return;
        }

        System.out.print("Masukkan No. Rekening Penerima: ");
        String noRekPenerima = scanner.nextLine();
        Nasabah penerima = cariNasabahByNoRek(noRekPenerima);
        if (penerima == null) {
            System.out.println("GAGAL: Rekening penerima tidak ditemukan.");
            return;
        }
        
        if (noRekPengirim.equals(noRekPenerima)) {
            System.out.println("GAGAL: Anda tidak bisa mentransfer ke rekening sendiri.");
            return;
        }
        
        System.out.print("Masukkan Jumlah Transfer: ");
        double jumlah = Double.parseDouble(scanner.nextLine());

        if (pengirim.saldo >= (jumlah + BIAYA_TRANSFER)) {
            pengirim.saldo -= (jumlah + BIAYA_TRANSFER);
            penerima.saldo += jumlah;
            
            pengirim.mutasiRekening.add("Transfer Keluar: -Rp" + String.format("%,.2f", jumlah) + " ke " + penerima.nama);
            penerima.mutasiRekening.add("Transfer Masuk: +Rp" + String.format("%,.2f", jumlah) + " dari " + pengirim.nama);
            
            System.out.println("BERHASIL: Transfer berhasil.");
        } else {
            System.out.println("GAGAL: Saldo tidak mencukupi.");
        }
    }

    public static void lihatMutasiRekening() {
        System.out.println("\n--- Lihat Mutasi Rekening ---");
        System.out.print("Masukkan No. Rekening: ");
        String noRek = scanner.nextLine();
        
        Nasabah nasabah = cariNasabahByNoRek(noRek);
        
        if (nasabah != null) {
            System.out.println("\nMutasi Rekening untuk: " + nasabah.nama);
            System.out.println("---------------------------------------------------");
            if (nasabah.mutasiRekening.isEmpty()) {
                System.out.println("Belum ada mutasi di rekening ini.");
            } else {
                for (String mutasi : nasabah.mutasiRekening) {
                    System.out.println("- ".concat(mutasi));
                }
            }
            System.out.println("---------------------------------------------------");
        } else {
            System.out.println("GAGAL: Rekening tidak ditemukan.");
        }
    }
    
    public static void cariNasabah() {
        System.out.println("\n--- Cari Nasabah ---");
        System.out.print("Masukkan Nama atau No. Rekening: ");
        String keyword = scanner.nextLine().toLowerCase(); 
        
        boolean ditemukan = false;
        System.out.println("Hasil Pencarian:");
        for (Nasabah nasabah : daftarNasabah) {
            if (nasabah.nomorRekening.toLowerCase().equals(keyword) || nasabah.nama.toLowerCase().contains(keyword)) {
                System.out.println("- " + nasabah.toString());
                ditemukan = true;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Nasabah tidak ditemukan.");
        }
    }
    
    public static Nasabah cariNasabahByNoRek(String noRek) {
        for (Nasabah nasabah : daftarNasabah) {
            if (nasabah.nomorRekening.equals(noRek)) {
                return nasabah;
            }
        }
        return null;
    }
}