import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0;
        double n;
        System.out.print("Escolha um número: ");
        n = in.nextDouble();

        for (int i = 0; i <= n; i++) {
            if (n%i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }
}