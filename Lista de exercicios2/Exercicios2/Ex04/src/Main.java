import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        double n2;
        double r;
        double m1;
        System.out.print("Escolha uma nota: ");
        n = in.nextDouble();
        System.out.print("Escolha uma outra nota: ");
        n2 = in.nextDouble();
        m1 = (n + n2) / 2;
        if (m1 >= 50) {
            System.out.println("Aprovado!");
        }
        else {
            while (true) {
                System.out.print("Reprovado! Digite a nota da recuperação: ");
                r = in.nextDouble();

                if (((r + m1) / 2) >= 50); {
                    System.out.println("Aprovado!");
                    break;
                }
            }
        }
    }
}
