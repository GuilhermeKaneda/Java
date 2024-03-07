import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, som;
        System.out.print("Escolha um número: ");
        n1 = in.nextInt();
        System.out.print("Escolha outro número: ");
        n2 = in.nextInt();

        if(n1 > n2) {
            for (int i = n1-1; i > n2; i--) {
                System.out.println(i);
            }
        } else {
            for (int i = n1; i < n2; i++) {
                System.out.println(i);
            }
        }
    }
}