package library;

public class rak {

    public static void main(String[] args) {

        String[] kategoriTetap = {
                "Teknologi", "Filsafat", "Sejarah",
                "Agama", "Psikologi", "Politik", "Fiksi"
        };

        String p1 = "James Clear";
        String p2 = "Yuval Noah Harari";
        String p3 = "George Orwell";
        String p4 = "Rick Riordan";
        String p5 = "Dan Brown";
        String p6 = "Carl Jung";
        String p7 = "Stephen Hawking";
        String p8 = "Paulo Coelho";
        String p9 = "Haruki Murakami";
        String p10 = "Malcolm Gladwell";

        Buku[] daftarBuku = new Buku[35];
        int index = 0;

        daftarBuku[index++] = new Buku("AI Revolution", p1, "Teknologi", 2022);
        daftarBuku[index++] = new Buku("Cyber Security Essentials", p7, "Teknologi", 2019);
        daftarBuku[index++] = new Buku("Computer Networking", p7, "Teknologi", 2015);
        daftarBuku[index++] = new Buku("Data Science Handbook", p10, "Teknologi", 2020);
        daftarBuku[index++] = new Buku("Machine Learning Basics", p1, "Teknologi", 2021);

        daftarBuku[index++] = new Buku("Meditations", p6, "Filsafat", 2010);
        daftarBuku[index++] = new Buku("Beyond Good and Evil", p2, "Filsafat", 2018);
        daftarBuku[index++] = new Buku("Republic", p6, "Filsafat", 2011);
        daftarBuku[index++] = new Buku("Think Again", p10, "Filsafat", 2021);
        daftarBuku[index++] = new Buku("The Meaning of Life", p1, "Filsafat", 2023);

        daftarBuku[index++] = new Buku("Sapiens", p2, "Sejarah", 2014);
        daftarBuku[index++] = new Buku("Homo Deus", p2, "Sejarah", 2017);
        daftarBuku[index++] = new Buku("World War II", p7, "Sejarah", 2013);
        daftarBuku[index++] = new Buku("History of Civilization", p10, "Sejarah", 2020);
        daftarBuku[index++] = new Buku("Ancient Empires", p5, "Sejarah", 2012);

        daftarBuku[index++] = new Buku("Bible Study Guide", p8, "Agama", 2011);
        daftarBuku[index++] = new Buku("Religious Philosophy", p6, "Agama", 2016);
        daftarBuku[index++] = new Buku("Islamic Civilization", p5, "Agama", 2014);
        daftarBuku[index++] = new Buku("Christian Theology", p1, "Agama", 2021);
        daftarBuku[index++] = new Buku("Buddhism Path", p9, "Agama", 2019);

        daftarBuku[index++] = new Buku("Atomic Habits", p1, "Psikologi", 2018);
        daftarBuku[index++] = new Buku("Man’s Search for Meaning", p6, "Psikologi", 2011);
        daftarBuku[index++] = new Buku("The Power of Mind", p10, "Psikologi", 2022);
        daftarBuku[index++] = new Buku("Subconscious Secrets", p9, "Psikologi", 2017);
        daftarBuku[index++] = new Buku("The Shadow Theory", p6, "Psikologi", 2015);

        daftarBuku[index++] = new Buku("Animal Farm", p3, "Politik", 1945);
        daftarBuku[index++] = new Buku("1984", p3, "Politik", 1949);
        daftarBuku[index++] = new Buku("Global Politics", p10, "Politik", 2019);
        daftarBuku[index++] = new Buku("War Strategy", p7, "Politik", 2012);
        daftarBuku[index++] = new Buku("Diplomacy 101", p5, "Politik", 2014);

        daftarBuku[index++] = new Buku("Percy Jackson", p4, "Fiksi", 2006);
        daftarBuku[index++] = new Buku("Da Vinci Code", p5, "Fiksi", 2003);
        daftarBuku[index++] = new Buku("The Alchemist", p8, "Fiksi", 1988);
        daftarBuku[index++] = new Buku("Norwegian Wood", p9, "Fiksi", 1987);
        daftarBuku[index++] = new Buku("Brave New World", p3, "Fiksi", 1932);

        System.out.println("\n=========== DATA BUKU PERPUSTAKAAN ===========\n");

        for (String kategori : kategoriTetap) {
            System.out.println("===== Kategori " + kategori + " =====");
            for (Buku b : daftarBuku) {
                if (b.getKategori().equalsIgnoreCase(kategori)) {
                    b.tampilkanInfo();
                }
            }
            System.out.println();
        }
    }
}
