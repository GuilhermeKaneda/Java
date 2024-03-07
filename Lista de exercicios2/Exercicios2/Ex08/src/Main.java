import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        System.out.print("Escolha um número: ");
        n = in.nextDouble();
        if (n % 2 == 0) {
            System.out.print("O número é par");
        } else {
            System.out.print("O número é impar");
        }
    }
}
