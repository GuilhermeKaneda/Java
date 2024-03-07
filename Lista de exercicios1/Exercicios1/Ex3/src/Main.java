import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num3 = 0;
        System.out.print("Escolha um número: ");
        num3 = in.nextDouble();
        System.out.println("O quinto do número é: " + (num3/5));    }
}