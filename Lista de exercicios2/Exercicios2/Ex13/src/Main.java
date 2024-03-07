import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1;
        double n2;
        byte forma;
        double conta;

        System.out.println("\nMenu:");
        System.out.println("1. Círculo \n2. Triângulo Retângulo \n3. Retângulo\n");
        System.out.print("Escolha uma opção: ");
        forma = in.nextByte();

        switch (forma) {
            case 1:
                System.out.print("\nInforme o raio: ");
                n1 = in.nextByte();
                System.out.print("\nÁrea: " + (3.14*(n1*n1)));
                System.out.print("\nCircunferência: " + (6.28 * n1));
                break;
            case 2:
                System.out.print("\nInforme a base: ");
                n1 = in.nextByte();
                System.out.print("Informe a altura: ");
                n2 = in.nextByte();
                System.out.print("\nÁrea: " + ((n1*n2) / 2));
                conta = Math.sqrt((n1*n1) + (n2*n2));
                System.out.print("\nPerímetro: " + (n1 + n2 + conta));
                break;
            case 3:
                System.out.print("\nInforme a base: ");
                n1 = in.nextByte();
                System.out.print("\nInforme a altura: ");
                n2 = in.nextByte();
                System.out.print("\nÁrea: " + (n1 * n2));
                System.out.print("\nPerímetro: " + ((n1*2) + (n2*2)));
                break;
        }
    }
}