import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r3 = 0;
        System.out.print("Escolha um raio: ");
        r3 = in.nextDouble();
        double h3 = 0;
        System.out.print("Escolha uma altura: ");
        h3 = in.nextDouble();
        System.out.println("O volume de um cone com essas medidas é: " + (((r3*r3) * h3 * 3.14) / 3));    }
}