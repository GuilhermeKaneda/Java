import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        System.out.print("Digite um número: ");
        n = in.nextDouble();
        System.out.println("Tabuada de " + n + " até 10");

        for (int i = 0; i < 11; i++) {
            System.out.println(n*i);
        }
    }
}