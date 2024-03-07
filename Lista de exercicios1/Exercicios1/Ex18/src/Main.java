import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a1 = 0;
        System.out.print("Escolha uma variavel: ");
        a1 = in.nextDouble();
        double b1 = 0;
        System.out.print("Escolha outra variavel: ");
        b1 = in.nextDouble();
        System.out.println("O resultado da equação de primeiro grau é: " + (-b1/a1));
    }
}