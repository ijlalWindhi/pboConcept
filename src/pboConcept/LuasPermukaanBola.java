package pboConcept;
import java.util.Scanner;
public class LuasPermukaanBola {
    public static void hitung (double r){
        double luasPermukaan = 4*3.14*r*r;
        System.out.println("Luas permukaan bola: " + luasPermukaan);
    }
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        System.out.println("Menghitung Luas Permukaan Bola");
        System.out.print("Masukkan jari-jari: ");
        double r = masukan.nextDouble();
        hitung(r);
    }
}
