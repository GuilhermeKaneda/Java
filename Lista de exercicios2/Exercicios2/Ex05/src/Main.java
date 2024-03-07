import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n;
        double n2;
        double m;
        System.out.print("Escolha uma nota: ");
        n = in.nextDouble();
        System.out.print("Escolha uma outra nota: ");
        n2 = in.nextDouble();
        m = ((n + n2) / 2);

        if (m >= 8.5) {
            System.out.println("Sua nota é A");
        }

        if (m >= 7 && m < 8.5) {
            System.out.println("Sua nota é B");
        }

        if (m >= 5 && m < 7) {
            System.out.println("Sua nota é C");
        }

        if (m < 5) {
            System.out.println("Sua nota é D");
        }
    }
}
