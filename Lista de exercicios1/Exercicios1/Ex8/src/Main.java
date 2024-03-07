import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pol = 0;
        System.out.print("Escolha um número, em polegadas: ");
        pol = in.nextDouble();
        System.out.println("Esse número em mm é: " + (pol * 25.4));    }
}