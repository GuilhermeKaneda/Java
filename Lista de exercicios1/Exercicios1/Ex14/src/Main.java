import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double b = 0;
        double h = 0;
        System.out.print("Escolha uma base: ");
        b = in.nextDouble();
        System.out.print("Escolha a altura: ");
        h = in.nextDouble();
        System.out.println("A área do triangulo com essas medidas é: " + ((b * h) / 2));
    }
}