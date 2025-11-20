package library;

public class Buku {
    private String judul;
    private String penulis;
    private String kategori;
    private int tahunTerbit;

    public Buku(String judul, String penulis, String kategori, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilkanInfo() {
        System.out.println("Judul Buku   : " + judul);
        System.out.println("Penulis      : " + penulis);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("---------------------------------------");
    }

    public String getKategori() {
        return kategori;
    }
}
