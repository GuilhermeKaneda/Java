import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a2;
        double b2;
        double c;
        double delta;

        while (true) {
            System.out.print("Escolha a variavel a: ");
            a2 = in.nextDouble();
            System.out.print("Escolha a variavel b: ");
            b2 = in.nextDouble();
            System.out.print("Escolha a variavel c: ");
            c = in.nextDouble();
            delta = (b2 * b2) - 4 * a2 * c;

            if (delta > 0) {
                double raiz1;
                raiz1 = ((-b2) + Math.sqrt(delta)) / (2 * a2);
                double raiz2;
                raiz2 = ((-b2) - Math.sqrt(delta)) / (2 * a2);
                System.out.println("A solução da equação de segundo grau são as raizes: " + raiz1 + " e " + raiz2);
                break;
            }
            System.out.println("O delta é " + delta + ", uma raiz negativa. Tente Novamente!");
        }
    }
}