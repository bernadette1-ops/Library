package KRS;

public class Main {
    public static void main(String[] args) {
        data data = new data();
        output output = new output();

        data.inputMahasiswa();
        data.inputMataKuliah();
        output.cetakKRS(data);
    }
}
