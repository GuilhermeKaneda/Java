import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        while (true) {
            System.out.print("Escolha um número entre 5 e 9: ");
            n = in.nextDouble();
            if (n >= 5 && n <= 9) {
                System.out.println("Acertou");
                break;
            }
            System.out.println("Errou. Tenta novamente!");
        }
    }
}