import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = 0;
        System.out.print("Escolha um número: ");
        num1 = in.nextInt();
        System.out.println("O dobro do número é: " + (num1 * 2));
    }
}