import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int n2;
        System.out.print("Escolha um número inteiro: ");
        n = in.nextInt();
        System.out.println("Escolha outro número inteiro: ");
        n2 = in.nextInt();
        if (n > n2) {
            System.out.println("O número maior é: " + n);
        } else {
            System.out.println("O número maior é: " + n2);
        }
    }
}

