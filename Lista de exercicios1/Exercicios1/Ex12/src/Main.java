import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double faren = 0;
        System.out.print("Escolha uma temperatura, em fahrenheit: ");
        faren = in.nextDouble();
        System.out.println("Essa temperatura em celsius é: " + ((faren - 32) / 1.8));    }
}