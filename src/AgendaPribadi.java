/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mhmmd
 */
class AgendaPribadi extends Agenda {

    // Konstruktor
    public AgendaPribadi(String tanggal, String judul, String deskripsi, String kategori, String status) {
        super(tanggal, judul, deskripsi, kategori, status);
    }

    // Implementasi metode abstrak (Polymorphism)
    @Override
    public String[] getDetail() {
        return new String[] {
            getTanggal(),
            getJudul(),
            getDeskripsi(),
            getKategori(),
            getStatus()
        };
    }
}

