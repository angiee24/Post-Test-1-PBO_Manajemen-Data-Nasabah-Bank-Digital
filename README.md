# Post Test 1 PBO 
# Manajemen Data Nasabah Bank Digital

Angela Caroline Budiman (2409116008)

# Deskripsi
Program ini merupakan sebuah program sederhana CRUD dengan tema Manajemen Data Nasabah Bank Digital. Di program ini, pengguna dapat melakukan eksekusi untuk menambah, menghapus, melihat, mengedit, serta melakukan transaksi pada data nasabah bank.

# Alur Program
Program ini adalah simulasi sederhana untuk Manajemen Data Nasabah Bank Digital. Melalui menu konsol yang interaktif, pengguna dapat melakukan operasi data nasabah secara lengkap, mulai dari menambah (Create), melihat (Read), mengubah (Update), hingga menghapus (Delete) data. Program ini juga dilengkapi dengan fitur transaksi dasar seperti setor tunai, tarik tunai, dan transfer dana antar rekening.

# Output Program
Menu Program

<img width="345" height="228" alt="image" src="https://github.com/user-attachments/assets/d07e6d64-e02d-4c0a-abf2-5c8f99967316" />

Program ini berjalan dengan menampilkan delapan menu utama kepada pengguna. Opsi 1 sampai 4 digunakan untuk mengelola data dasar nasabah (tambah, lihat, ubah, hapus). Menu 5 membuka sub-menu untuk transaksi finansial, sementara menu 6 dan 7 berfungsi untuk melihat riwayat rekening dan mencari data nasabah. Program akan selalu kembali ke tampilan menu ini setelah setiap tugas selesai, hingga pengguna memilih menu 8 untuk keluar.


<img width="427" height="315" alt="image" src="https://github.com/user-attachments/assets/f6f99899-39bb-46bb-a8f0-6ff00e6ccdb0" />

setiap input yang bukan 1–8 akan dianggap tidak valid, lalu program otomatis mengarahkan kembali ke menu utama.

Menu Create (Tambah Nasabah)

<img width="717" height="136" alt="image" src="https://github.com/user-attachments/assets/c9dedb5a-a3bf-4cbc-a195-3e2b56c2ef6d" />

Pada menu **Tambah Nasabah**, pengguna diminta memasukkan nama dan jumlah setoran awal, lalu sistem secara otomatis membuat nomor rekening baru secara berurutan (contoh: `REK2025003`) dan menyimpan data tersebut ke dalam daftar nasabah. Setelah itu, program menampilkan pesan berhasil bahwa nasabah baru telah ditambahkan, kemudian pengguna diarahkan untuk menekan Enter agar kembali ke menu utama.


Menu Read (Tampilkan Nasabah)

<img width="718" height="142" alt="image" src="https://github.com/user-attachments/assets/718e1f77-1b43-4ee6-a69a-d2251e7e78cb" />

Pada menu **Tampilkan Nasabah**, program akan menampilkan seluruh data nasabah yang tersimpan dalam daftar, meliputi nomor rekening, nama, dan saldo masing-masing nasabah secara berurutan (contoh: REK2025001 atas nama Budi Santoso, REK2025002 atas nama Citra Lestari, dan REK2025003 atas nama Angie). Setelah data ditampilkan, pengguna diminta menekan Enter untuk kembali ke menu utama.


Menu Update (Ubah Nama Nasabah)

<img width="558" height="163" alt="image" src="https://github.com/user-attachments/assets/bda2bc18-5475-4f47-ad26-1a94f978a8b5" />

Pada menu **Ubah Nama Nasabah**, pengguna diminta memasukkan nomor rekening nasabah yang datanya akan diperbarui. Program kemudian menampilkan nama saat ini dari nasabah tersebut, lalu meminta input nama baru. Setelah pengguna memasukkan nama baru (contoh: dari *Angie* menjadi *Angela*), sistem akan langsung memperbarui data dan menampilkan pesan berhasil, kemudian pengguna diarahkan untuk menekan Enter agar kembali ke menu utama.

<img width="465" height="122" alt="image" src="https://github.com/user-attachments/assets/28dab0c6-0f13-4217-9e51-ac2acec2c8d2" />

Pada menu **Ubah Nama Nasabah**, jika pengguna memasukkan nomor rekening yang tidak terdaftar dalam sistem (contoh: `12`), maka program akan menampilkan pesan **"GAGAL: Rekening tidak ditemukan."**. Setelah itu, pengguna diarahkan untuk menekan Enter agar kembali ke menu utama tanpa ada perubahan data nasabah.


Menu Delete (Hapus Nasabah)

<img width="556" height="115" alt="image" src="https://github.com/user-attachments/assets/b1df4380-413b-4bef-8e9f-dca97dedfe8a" />

Pada menu **Hapus Nasabah**, pengguna diminta memasukkan nomor rekening yang ingin dihapus. Jika nomor rekening tersebut ditemukan dalam daftar (contoh: `REK2025003`), maka program akan menghapus data nasabah yang bersangkutan dari sistem dan menampilkan pesan **"BERHASIL: Nasabah telah dihapus."**. Setelah itu, pengguna diarahkan untuk menekan Enter agar kembali ke menu utama.


<img width="483" height="88" alt="image" src="https://github.com/user-attachments/assets/2b014186-3d09-4ff4-867c-61a940c8a414" />

Pada menu Hapus Nasabah, jika pengguna memasukkan nomor rekening yang tidak terdaftar dalam sistem (contoh: 123), maka program akan menampilkan pesan "GAGAL: Rekening tidak ditemukan.". Setelah itu, pengguna diarahkan untuk menekan Enter agar kembali ke menu utama tanpa ada data yang terhapus

Menu Transaksi (Lakukan Transaksi)

<img width="323" height="136" alt="image" src="https://github.com/user-attachments/assets/b09d8b3d-678d-426c-8b99-d216fccd87fe" />

Ketika pengguna memilih menu "Lakukan Transaksi" dari menu utama, program akan menampilkan sub-menu khusus transaksi seperti yang terlihat pada gambar. Di sini, pengguna diberikan pilihan untuk melakukan Setor Tunai (1), Tarik Tunai (2), atau Transfer Dana (3). Opsi nomor 4 disediakan agar pengguna dapat kembali ke menu utama jika tidak ingin melanjutkan transaksi.

<img width="392" height="106" alt="image" src="https://github.com/user-attachments/assets/242fdc7b-e5f1-4c5d-aea8-a893fb199e7c" />

Pada menu Setor Tunai, pengguna diminta memasukkan nomor rekening tujuan (contoh: REK2025001) diikuti dengan jumlah nominal yang akan disetor. Jika rekening ditemukan dan nominal valid, program akan menambahkan jumlah tersebut ke saldo nasabah dan mencatatnya di mutasi. Sebagai konfirmasi, sistem akan menampilkan pesan "BERHASIL" beserta saldo terbaru dari rekening tersebut.

<img width="442" height="112" alt="image" src="https://github.com/user-attachments/assets/f5437961-0fbc-4c06-ac17-afc054edc357" />

dsadasdasd

<img width="680" height="150" alt="image" src="https://github.com/user-attachments/assets/6f879db1-a207-4212-be14-4be0992fc92b" />

dsadasd

<img width="434" height="138" alt="image" src="https://github.com/user-attachments/assets/8f2f7475-2bbb-4462-9bae-42409dbffade" />

dsadasda

<img width="437" height="115" alt="image" src="https://github.com/user-attachments/assets/40b63c50-e20b-4594-b05e-e2b360f93114" />

dsadasdasdas

<img width="460" height="172" alt="image" src="https://github.com/user-attachments/assets/a50a426f-9274-4851-a733-c609c735ccd8" />

dsadas

<img width="569" height="151" alt="image" src="https://github.com/user-attachments/assets/96819513-c758-4af3-a533-44e9494fa7b5" />

dsadasdasdas

<img width="469" height="164" alt="image" src="https://github.com/user-attachments/assets/65111d0c-94a5-460d-80da-f3d170282faa" />

dsadasdsad

<img width="377" height="275" alt="image" src="https://github.com/user-attachments/assets/8e7f34c9-cd43-40f1-8b3c-d92e8bf70aa3" />

dsadasd


<img width="461" height="231" alt="image" src="https://github.com/user-attachments/assets/215ddc3a-6479-48bf-a95b-7cb1ddc78741" />

dsadasda



Menu Mutasi (Lihat Mutasi Rekening)

<img width="546" height="207" alt="image" src="https://github.com/user-attachments/assets/112a5892-556c-4164-8f34-dad6d2ccd885" />

Pada menu Lihat Mutasi Rekening, pengguna diminta memasukkan nomor rekening yang ingin diperiksa (contoh: REK2025001). Jika nomor rekening ditemukan, program akan menampilkan nama pemilik rekening sebagai judul, diikuti oleh daftar semua transaksi yang pernah tercatat. Pada contoh ini, hanya transaksi "Setoran Awal" yang ditampilkan karena belum ada aktivitas lain yang dilakukan oleh nasabah tersebut.

<img width="440" height="119" alt="image" src="https://github.com/user-attachments/assets/a81a8e3d-a015-4441-839e-d22da9b5091a" />

Alur ini menunjukkan penanganan kesalahan saat pengguna mencoba melihat mutasi rekening dengan nomor yang tidak terdaftar. Ketika pengguna memasukkan nomor rekening yang tidak ada di dalam sistem (contoh: 2409116008), program akan gagal menemukan data yang cocok dan akan menampilkan pesan "GAGAL: Rekening tidak ditemukan." untuk menginformasikan pengguna.

Menu Search (Cari Nasabah)

<img width="652" height="135" alt="image" src="https://github.com/user-attachments/assets/790020ff-a68e-49ea-8107-5c3c4d311f4d" />

Pada menu Cari Nasabah, pengguna dapat memasukkan kata kunci berupa Nama ataupun Nomor Rekening (contoh: REK2025001). Program kemudian akan melakukan iterasi pada seluruh data nasabah. Jika ditemukan data yang cocok dengan kata kunci, baik pada nama maupun nomor rekening, maka detail lengkap dari nasabah tersebut akan ditampilkan di bawah "Hasil Pencarian".

<img width="425" height="143" alt="image" src="https://github.com/user-attachments/assets/6e9e6b32-617e-4914-8221-f80777d8232d" />

Alur ini menunjukkan hasil pencarian jika data tidak ditemukan. Ketika pengguna memasukkan kata kunci yang tidak cocok dengan nama atau nomor rekening manapun yang ada di dalam sistem (contoh: Angie), program akan menyelesaikan proses pencarian tanpa menemukan hasil. Sebagai umpan balik, sistem akan menampilkan pesan informatif "Nasabah tidak ditemukan".


Menu Exit (Keluar)

<img width="758" height="48" alt="image" src="https://github.com/user-attachments/assets/9e41f980-1f0c-4890-9b91-25eacbdad716" />

Terakhir, jika pengguna memilih menu Keluar (contoh: opsi nomor 8), program akan menampilkan pesan perpisahan "Terima kasih!". Setelah itu, perintah return dieksekusi, yang akan menghentikan perulangan utama (main loop) dan mengakhiri sesi program secara permanen.
