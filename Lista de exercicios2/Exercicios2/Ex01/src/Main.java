import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        while (true) {
            System.out.print("Escolha um número: ");
            n = in.nextDouble();
            System.out.println("Número inválido. Tente novamente");

            if (n > 0.0) {
                System.out.println("A raiz quadrada desse número é: " + Math.sqrt(n));
                break;
            }
        }
    }
}