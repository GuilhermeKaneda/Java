import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base;
        int exp;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número base: ");
        base = in.nextInt();
        System.out.print("Digite o número expoente: ");
        exp = in.nextInt();
        int result = base;
        int aux = exp;
        pot(base, exp, result, aux);
    }

    static int pot(int base, int exp, int result, int aux) {
        result *= base;
        aux--;

        if(aux <= 1) {
            System.out.println("O resultado de " + base + " elevado a " + exp + " é " + result);
            return 0;
        }
        return pot(base, exp, result, aux);
    }
}