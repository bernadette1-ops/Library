package peminjaman;

import java.util.Scanner;

public class Mahasiswa {
    String nim;
    String nama;

    Buku[] daftarBuku = new Buku[20]; 
    int jumlahPinjam = 0;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public void pinjam(String isbn, String judul) {
        daftarBuku[jumlahPinjam] = new Buku(isbn, judul);
        jumlahPinjam++;
    }

    public void tampilkanData() {
        System.out.println("======================================================");
        System.out.println("NIM   : " + nim);
        System.out.println("Nama  : " + nama);

        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("| %-2s | %-30s | %-50s |\n", "No", "ISBN", "Judul Buku");
        System.out.println("----------------------------------------------------------------------------------------");

        for (int i = 0; i < jumlahPinjam; i++) {
            System.out.printf("| %-2d | %-30s | %-50s |\n", 
                              (i + 1), 
                              daftarBuku[i].isbn, 
                              daftarBuku[i].judul);
        }

        System.out.println("----------------------------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIM mahasiswa : ");
        String nim = input.nextLine();

        System.out.print("Masukkan Nama mahasiswa : ");
        String nama = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nim, nama);

        String lagi;

        do {
            System.out.print("\nMasukkan ISBN buku     : ");
            String isbn = input.nextLine();

            System.out.print("Masukkan Judul Buku    : ");
            String judul = input.nextLine();

            mhs.pinjam(isbn, judul);

            System.out.print("\nTambah buku lagi? (y/n): ");
            lagi = input.nextLine();

        } while (!lagi.equalsIgnoreCase("n"));

        System.out.println();
        mhs.tampilkanData();
        input.close();
    }
}
