import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0, j, k, n;
        j = 0;
        k = 1;
        System.out.print("Escolha um número: ");
        n = in.nextInt();
        System.out.println(j);
        System.out.println(k);

        while(true) {
            i = j + k;
            if (i >= n) {
                break;
            }
            System.out.println(i);
            j = k;
            k = i;
        }
    }
}