package praktikum3pbo;
public class Main {
    public static void main(String[] args) {
        boolean nilaiBenar = true;
        boolean nilaiSalah = false;
        boolean hasil;
        hasil = nilaiBenar && nilaiSalah;
        System.out.println(nilaiBenar + " and " + nilaiSalah + " = " + hasil);
        hasil = nilaiBenar || nilaiSalah;
        System.out.println(nilaiBenar + " or " + nilaiSalah + " = " + hasil);
        hasil = !nilaiBenar;
        System.out.println("not " + nilaiBenar + " = " + hasil);
    }
}
