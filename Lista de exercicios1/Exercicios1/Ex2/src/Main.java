import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num2 = 0;
        System.out.print("Escolha um número: ");
        num2 = in.nextDouble();
        System.out.println("O quadrado do número é: " + (num2*num2));
    }
}