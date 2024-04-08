import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        int aux = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        n = in.nextInt();
        int result = n;
        fat(n, aux, result);
    }

    static int fat(int n, int aux, int result) {
        result *= n - aux;
        aux++;

        if(aux == n-1) {
            System.out.println("O fatorial de " + n + " é " + result);
            return 0;
        }
        return fat(n, aux, result);
    }
}