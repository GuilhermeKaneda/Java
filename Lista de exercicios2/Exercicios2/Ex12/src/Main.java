import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1;
        double n2;
        byte operacao;

        System.out.print("Digite um número: ");
        n1 = in.nextInt();
        System.out.print("Digite outro número: ");
        n2 = in.nextInt();
        System.out.println("\nMenu:");
        System.out.println("1. Soma \n2. Subtração \n3. Multiplicação \n4. Divisão\n");
        System.out.print("Escolha a operação: ");
        operacao = in.nextByte();

        switch (operacao) {
            case 1:
                System.out.println("Resultado: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Resultado: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Resultado: " + (n1 * n2));
                break;
            case 4:
                System.out.println("Resultado: " + (n1 / n2));
                break;
        }
    }
}