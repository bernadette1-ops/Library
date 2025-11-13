package KRS;

public class output {
    public void cetakKRS(data data) {
        System.out.println("nim: " + data.nim);
        System.out.println("nama: " + data.nama);
        System.out.println("----------------------------------------------------");
        System.out.println("No | Kode  | Nama Mata Kuliah         | SKS");
        System.out.println("----------------------------------------------------");
        
        for (int i = 0; i < data.jumlahMK; i++) {
            System.out.printf("%-2d | %-5s | %-25s | %-3d\n", 
                (i + 1), data.kodeMK[i], data.namaMK[i], data.sksMK[i]);
        }

        System.out.println("----------------------------------------------------");
        System.out.printf("%33s | Total SKS | %d\n", "", data.totalSKS);
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println("                         Mengetahui");
        System.out.println();
        System.out.println("                         " + data.nama);
        System.out.println("                         " + data.nim);
    }
}
