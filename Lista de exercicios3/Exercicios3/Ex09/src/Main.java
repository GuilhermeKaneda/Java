import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("\nTabuada do " + i);
            for (int j = 1; j < 11; j++) {
                while (true) {
                    System.out.println("Qual o resultado da proxima operação: ");
                    n = in.nextInt();

                    if(n == (i*j)) {
                        System.out.println("Acertou!");
                        break;
                    }

                    System.out.println("Errou!");
                }
            }
        }
    }
}
