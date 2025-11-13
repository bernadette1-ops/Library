package KRS;
import java.util.Scanner;

public class data {
    public String nim;
    public String nama;
    public String[] kodeMK = new String[10];
    public String[] namaMK = new String[10];
    public int[] sksMK = new int[10];
    public int jumlahMK;
    public int totalSKS;

    Scanner input = new Scanner(System.in);

    public void inputMahasiswa() {
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
    }

    public void inputMataKuliah() {
        totalSKS = 0;
        jumlahMK = 0;


        while (true) {
            System.out.print("Kode MK: ");
            kodeMK[jumlahMK] = input.nextLine();
            System.out.print("Nama MK: ");
            namaMK[jumlahMK] = input.nextLine();
            System.out.print("SKS MK: ");
            sksMK[jumlahMK] = input.nextInt();
            input.nextLine(); 

            totalSKS += sksMK[jumlahMK];
            jumlahMK++;

            if (totalSKS > 24) {
                System.out.println("Melebihi batas 24 SKS! Data tidak berhasil di masukkan.");
                totalSKS -= sksMK[jumlahMK - 1];
                jumlahMK--;
                break;
            }

            System.out.print("Tambah mata kuliah lagi? (y/n): ");
            String lagi = input.nextLine();
            if (lagi.equalsIgnoreCase("n")) break;
        }
    }
}
