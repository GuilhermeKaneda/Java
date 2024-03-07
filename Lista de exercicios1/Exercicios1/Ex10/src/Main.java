import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double milhas = 0;
        System.out.print("Escolha uma quantidade de milhas: ");
        milhas = in.nextDouble();
        System.out.println("Essa quantidade em km é: " + (milhas * 1.6));    }
}