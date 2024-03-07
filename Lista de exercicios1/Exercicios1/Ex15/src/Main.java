import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r2 = 0;
        System.out.print("Escolha um raio: ");
        r2 = in.nextDouble();
        double h2 = 0;
        System.out.print("Escolha uma altura: ");
        h2 = in.nextDouble();
        System.out.println("O volume de um cilindo com essas medidas é: " + ((3.14 * (r2*r2)) * h2));    }
}