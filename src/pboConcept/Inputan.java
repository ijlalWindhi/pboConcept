package pboConcept;
import java.util.Scanner;
public class Inputan {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a, b;
        System.out.print("Masukkan nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukkan nilai b : ");
        b = masukan.nextInt();
        System.out.println("Nilai Variable yang ada pada program :");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
}
