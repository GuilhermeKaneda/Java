import java.util.Scanner;

public class Main {
    static double contaReal(double lado1, double lado2, double lado3) {
        if (lado1 < (lado2 + lado3)) {
            return 0;
        }
        else {
            System.out.println("O lado de medida " + lado1 + " não está validado.");

            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double l1;
        double l2;
        double l3;
        double test1;
        double test2;
        double test3;
        System.out.print("Escolha o número do primeiro lado: ");
        l1 = in.nextDouble();
        System.out.print("Escolha o número do segundo lado: ");
        l2 = in.nextDouble();
        System.out.print("Escolha o número do terceiro lado: ");
        l3 = in.nextDouble();

        test1 = contaReal(l1, l2, l3);
        test2 = contaReal(l2, l1, l3);
        test3 = contaReal(l3, l1, l3);

        if (test1 == 0 && test2 == 0 && test3 == 0) {
            System.out.println("Lados validados!");

            if (l1 == l2 && l1 == l3) {
                System.out.print("O triângulo é equilátero.");
            }

            if ((l1 == l2 || l2 == l3 || l1 == l3) && (l1 != l2 || l2 != l3 || l1 != l3)) {
                System.out.print("O triângulo é isósceles.");
            }

            if (l1 != l2 || l2 != l3 || l1 != l3) {
                System.out.print("O triângulo é escaleno.");
            }
        }
    }
}