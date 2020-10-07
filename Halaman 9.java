package praktikum3pbo;
public class Main {
    public static void main(String[] args) {
        int operan1, operan2, hasil;
        operan1 = 12;
        operan2 = 5;
        hasil = operan1 + operan2;
        System.out.println("Hasil Penjumlahan " + hasil);
        hasil = operan2 - operan1;
        System.out.println("Hasil Pengurangan " + hasil);
        hasil = operan1 * operan2;
        System.out.println("Hasil Perkalian " + hasil);
        hasil = operan1 % operan2;
        System.out.println("Sisa Pembagian " + hasil);
    }
}