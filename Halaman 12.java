package praktikum3pbo;
public class Main {
    public static void main(String[] args) {
        int operan;
        operan = 10;
        System.out.println("Sebelum plus plus " + operan);
        operan++; // operan = operan + 1;
        System.out.println("Setelah plus plus " + operan);
        operan = 10;
        System.out.println("Sebelum min min " + operan);
        operan--; // operan = operan - 1;
        System.out.println("Setelah min min " + operan);
        operan += 3; // operan = operan + 3;
        System.out.println("Operan ditambah 3 menjadi " + operan);
        operan -= 8; // operan = operan - 8;
        System.out.println("Operan dikurang 8 menjadi " + operan);
    }
}