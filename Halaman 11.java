package praktikum3pbo;
public class Main {
    public static void main(String[] args) {
        char char1 = 'U', char2 = 'I';
        String string1, string2, string3;
        string1 = char1 + " " + char2;
        System.out.println("Hasil penjumlahan 2 char " + string1);
        string2 = string1 + " " + char2;
        System.out.println("Hasil penjumlahan char dengan string" + string2);
        string3 = string1 + " " + string2;
        System.out.println("Hasil penjumlahan 2 string " + string3);
    }
}