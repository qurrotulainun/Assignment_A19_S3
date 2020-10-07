package praktikum3pbo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner pembaca = new Scanner(System.in);
        char karakter = 'A';
        String untaian = "Hello World";
        String nama;
        untaian = untaian + " " + karakter;
        System.out.println(untaian);
        // membaca string
        System.out.print("Masukkan nama anda: ");
        nama = pembaca.nextLine();
        System.out.println("Jadi nama anda adalah " + nama);
    }
}
