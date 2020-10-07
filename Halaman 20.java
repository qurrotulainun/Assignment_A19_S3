package praktikum3pbo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        int tekananDarah;
        Scanner pembaca = new Scanner(System.in);
        System.out.print("Masukkan tekanan darah anda: ");
        tekananDarah = pembaca.nextInt();
        // kondisi yang dicek
        if (tekananDarah > 140) {
        // banyak perintah yang dilakukan sehingga diberikan dalam blok diapit dengan kurung kurawal
            System.out.println("Anda mengalami hipertensi");
            System.out.println("Segera hubungi dokter untuk penanganan lebih lanjut");
        }
        // kondisi di luar if akan kembali selalu dieksekusi
        System.out.println("Terima kasih. Makanlah makanan yang halal dan sehat agar anda terhindar dari berbagai penyakit");
    }
}