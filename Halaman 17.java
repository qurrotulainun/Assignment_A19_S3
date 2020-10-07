package praktikum3pbo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int angka;
        Scanner pembaca = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        angka = pembaca.nextInt();
        // jika benar (lbh besar dari nol)
        if (angka > 0) {
            System.out.println("Ok, masukan adalah positif");
            // selain itu, (tdk lbh besar dari nol),
        } else {
            // cetak bukan positif
            System.out.println("Maaf, masukan bukan positif");
        }
    }
}
