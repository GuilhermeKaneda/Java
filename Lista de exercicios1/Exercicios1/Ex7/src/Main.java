import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double mm = 0;
        System.out.print("Escolha um número, em mm: ");
        mm = in.nextDouble();
        System.out.println("Essa medida em polegadas é: " + (mm / 25.4));    }
}