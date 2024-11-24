/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mhmmd
 */
abstract class Agenda {
    private String tanggal;
    private String judul;
    private String deskripsi;
    private String kategori;
    private String status;

    // Konstruktor
    public Agenda(String tanggal, String judul, String deskripsi, String kategori, String status) {
        this.tanggal = tanggal;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.status = status;
    }

    // Getter dan Setter (Encapsulation)
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Metode abstrak untuk menampilkan detail (Abstraction)
    public abstract String[] getDetail();
}
