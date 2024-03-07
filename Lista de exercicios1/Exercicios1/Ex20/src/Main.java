import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = 0;
        System.out.print("Escolha a variavel de uma raiz: ");
        x1 = in.nextDouble();
        double x2 = 0;
        System.out.print("Escolha a variavel de outra raiz: ");
        x2 = in.nextDouble();
        System.out.println("A raiz quadrada é: x2 - " + (x1+x2) + " + " + (x1*x2));
    }
}