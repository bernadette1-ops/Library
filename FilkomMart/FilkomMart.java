package FilkomMart;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilkomMart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        System.out.print("Collected by: ");
        nama = input.nextLine();

        System.out.print("Jumlah barang yang dibeli: ");
        int y = input.nextInt();
        input.nextLine(); // clear buffer

        Barang[] daftarBarang = new Barang[y];

        // Input data barang
        for (int i = 0; i < y; i++) {
            System.out.print("Nama Barang   " + (i + 1) + " : ");
            String namaBarang = input.nextLine();
            System.out.print("Jumlah Barang " + (i + 1) + " : ");
            int jumlah = input.nextInt();
            System.out.print("Harga Barang  " + (i + 1) + " : ");
            double harga = input.nextDouble();
            input.nextLine(); // clear buffer

            daftarBarang[i] = new Barang(namaBarang, jumlah, harga);
        }

        // Hitung total belanja
        double totalBelanja = 0;
        for (Barang b : daftarBarang) {
            totalBelanja += b.getTotal();
        }

        // Hitung diskon otomatis
        double diskon;
        if (totalBelanja >= 500000) {
            diskon = 0.2;
        } else if (totalBelanja >= 100000) {
            diskon = 0.1;
        } else if (totalBelanja >= 50000) {
            diskon = 0.05;
        } else {
            diskon = 0;
        }

        double diskon_in_percent = diskon * 100;
        double dis = totalBelanja * diskon;
        double totalBayar = totalBelanja - dis;

        System.out.printf("Total  : Rp %.0f\n", totalBayar);
        System.out.print("Bayar  : Rp ");
        int Bayar = input.nextInt();
        double kembalian = Bayar - totalBayar;

        // Info waktu dan ID
        String tanggal = new SimpleDateFormat("dd MMMM yyyy").format(new Date());
        String waktu = new SimpleDateFormat("HH:mm").format(new Date());
        String receiptNum = "150901";
        String orderID = "FM001";

        // Cetak struk
        System.out.printf("\n           FILKOM-MART           \n");
        System.out.printf("        JL VETERAN MALANG        \n");
        System.out.printf("        TELP. 0341-577911        \n");
        System.out.printf("=================================\n");
        System.out.printf("%-15s                %s\n", tanggal, waktu);
        System.out.printf("Receipt Number :           %s\n", receiptNum);
        System.out.printf("Order ID       :           %s\n", orderID);
        System.out.printf("Collected by   :           %s\n", nama);
        System.out.printf("=================================\n");

        // Daftar barang
        for (Barang b : daftarBarang) {
            System.out.println(b.getNamaBarang());
            System.out.printf("%dx   @%.0f          %.0f\n",
                    b.getJumlah(), b.getHarga(), b.getTotal());
        }

        System.out.printf("=================================\n");
        System.out.printf("Subtotal              Rp %.0f", totalBelanja);
        System.out.printf("\nDiskon");
        System.out.printf("\n%.0f%%                  - Rp %.0f", diskon_in_percent, dis);
        System.out.printf("\n=================================\n");
        System.out.printf("Total                 Rp  %.0f", totalBayar);
        System.out.printf("\nBayar                 Rp  %.0f", (double) Bayar);
        System.out.printf("\n=================================\n");
        System.out.printf("Kembalian           - Rp  %.0f", kembalian);
        System.out.printf("\n=================================\n");
        System.out.println("          TERIMA KASIH :)        ");
    }
}

   