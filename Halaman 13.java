package praktikum3pbo;
public class Main {
    public static void main(String[] args) {
        boolean hasil;
        int operan1 = 25, operan2 = 124;
        hasil = operan1 > operan2;
        System.out.println("25 > 124 hasilnya " + hasil);
        double operan3 = 3.2, operan4 = 2.56789;
        hasil = operan3 < operan4;
        System.out.println("3.2 < 2.56789 hasilnya " + hasil);
        char operanA = 'H', operanB = 'P';
        hasil = operanA <= operanB;
        System.out.println("H <= P hasilnya " + hasil);
        operan3 = 4;
        operan4 = 3.999999;
        hasil = operan3 >= operan4;
        System.out.println("4 >= 3.999999 hasilnya " + hasil);
        operanA = 'H';
        operanB = 'h';
        hasil = operanA == operanB;
        System.out.println("H == h hasilnya " + hasil);
        operan3 = 4;
        operan4 = 3.999999;
        hasil = operan3 >= operan4;
        System.out.println("4 >= 3.999999 hasilnya " + hasil);
    }
}