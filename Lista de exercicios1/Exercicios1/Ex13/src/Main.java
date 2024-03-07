import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m1 = 0;
        double m2 = 0;
        double media;
        while (true) {
            System.out.print("Escolha a primeira nota: ");
            m1 = in.nextDouble();
            System.out.print("Escolha a segunda nota: ");
            m2 = in.nextDouble();
            media = ((m1 * 1) + (m2 * 2)) / (m1 + m2);
            if (media < 10) {
                System.out.println("A média ponderada dessas notas é: " + media);
                break;
            }
            System.out.println("A média ponderada dessas notas é " + media + ", porém, é maior que 10. Tente novamente.");
        }
    }
}