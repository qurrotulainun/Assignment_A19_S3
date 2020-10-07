package praktikum3pbo;
public class Main {
    public static void main(String[] args) {
        // ubah tipe data sesuai nilainya agar tidak error
        byte nilai1 = 100;
        byte nilai2 = (byte) -200;
        byte nilai3 = (byte) 40000;
        byte nilai4;
        nilai4 = (byte) (nilai3 * nilai3 * nilai3);
        System.out.println(nilai4);
    }
}
