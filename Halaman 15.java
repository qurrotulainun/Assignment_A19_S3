package praktikum3pbo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int angka;
        Scanner pembaca = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        angka = pembaca.nextInt();
        if (angka % 2 == 0){
            // jika positif lakukan sesuatu, misal cetak positif
            System.out.println("Masukan adalah bilangan positif");
        } else  {
            // jika bukan positif cetak bukan positif
            System.out.println("Masukan bukan positif");
        }
    }
}