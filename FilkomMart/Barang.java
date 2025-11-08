package FilkomMart;

public class Barang {
    private String namaBarang;
    private int jumlah;
    private double harga;

    public Barang(String namaBarang, int jumlah, double harga) {
        this.namaBarang = namaBarang;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public double getTotal() {
        return jumlah * harga;
    }
}
