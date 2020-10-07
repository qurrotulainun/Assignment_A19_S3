package praktikum3pbo;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        int angka = 1;
        boolean isGenap = angka % 2 == 0;
        if (isGenap) { //if (kondisi/ekspresi boolean)
        // perintah dilakukan saat kondisi benar
            System.out.println("Genap");
        } else { //else
        // perintah dilakukan saat kondisi salah
            System.out.println("Ganjil");
        }
    }
}