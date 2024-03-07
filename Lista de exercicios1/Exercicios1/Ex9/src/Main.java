import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double km2 = 0;
        System.out.print("Escolha uma kilometragem: ");
        km2 = in.nextDouble();
        System.out.println("Essa kilometragem em milhas é: " + (km2 * 0.6));    }
}