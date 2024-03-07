import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        System.out.print("Escolha uma temperatura, em celsius: ");
        celsius = in.nextDouble();
        System.out.println("Essa temperatura em fahrenheit é: " + ((celsius * 1.8) + 32));    }
}