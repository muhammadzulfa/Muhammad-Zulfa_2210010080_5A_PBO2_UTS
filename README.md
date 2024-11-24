# Dokumentasi Aplikasi Agenda Pribadi

Aplikasi *Agenda Pribadi* ini dikembangkan menggunakan bahasa pemrograman Java dengan menggunakan library **Gson** versi 2.8.8 untuk pengolahan data JSON. Aplikasi ini memiliki berbagai fitur untuk mengelola agenda pribadi, seperti autentikasi pengguna, tampilan dashboard untuk menampilkan daftar agenda, serta fitur untuk menambah, mengubah, menandai agenda selesai, dan menghapus agenda.

## Fitur Aplikasi

### 1. **Autentikasi Pengguna**
Aplikasi ini memiliki sistem autentikasi pengguna untuk melakukan login. Pengguna harus memasukkan password untuk mengakses aplikasi. Password default untuk login adalah **"admin"**.

### 2. **Dashboard Agenda**
Setelah login berhasil, pengguna akan diarahkan ke dashboard yang menampilkan daftar agenda yang ada. Setiap agenda akan menampilkan informasi berikut:
- **Tanggal**: Tanggal agenda dalam format `yyyy-MM-dd`.
- **Judul**: Judul agenda.
- **Deskripsi**: Deskripsi agenda.
- **Kategori**: Kategori agenda, misalnya: Pekerjaan, Personal, dll.
- **Status**: Status agenda, apakah "Belum Selesai" atau "Selesai".

### 3. **Menambah Agenda**
Pengguna dapat menambah agenda baru dengan memasukkan data seperti tanggal, judul, deskripsi, kategori, dan status agenda (status default: "Belum Selesai").

### 4. **Mengubah Agenda**
Pengguna dapat mengubah agenda yang sudah ada, baik itu mengganti tanggal, judul, deskripsi, kategori, atau status agenda.

### 5. **Menandai Agenda Selesai**
Pengguna dapat menandai agenda yang telah selesai. Setelah ditandai selesai, status agenda akan berubah menjadi "Selesai".

### 6. **Menghapus Agenda**
Pengguna dapat menghapus agenda yang tidak diperlukan lagi dari daftar agenda yang ada.

## Struktur Data Agenda

Setiap agenda terdiri dari beberapa atribut berikut:

- **Tanggal (String)**: Tanggal agenda dalam format `yyyy-MM-dd`.
- **Judul (String)**: Judul agenda.
- **Deskripsi (String)**: Deskripsi agenda.
- **Kategori (String)**: Kategori agenda, seperti Pekerjaan, Personal, dll.
- **Status (String)**: Status agenda, yang bisa berupa "Belum Selesai" atau "Selesai".

Contoh JSON untuk satu agenda:

```json
{
  "tanggal": "2024-11-24",
  "judul": "Pertemuan Tim",
  "deskripsi": "Membahas proyek terbaru",
  "kategori": "Pekerjaan",
  "status": "Belum Selesai"
}
