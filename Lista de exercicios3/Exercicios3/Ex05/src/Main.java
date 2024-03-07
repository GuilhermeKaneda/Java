import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int fat = 0;
        System.out.print("Digite um número: ");
        n = in.nextInt();

        fat = n;
        for (int i = 2; i < n; i++) {
            fat *= i;
        }

        System.out.println("O resultado da fatorial é: " + fat);
    }
}