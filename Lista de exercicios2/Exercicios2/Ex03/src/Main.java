import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        double n2;
        System.out.print("Escolha uma nota: ");
        n = in.nextDouble();
        System.out.println("Escolha uma outra nota: ");
        n2 = in.nextDouble();
        if (((n + n2)/2) >= 50) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
