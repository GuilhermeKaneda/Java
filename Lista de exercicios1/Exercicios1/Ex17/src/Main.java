import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vi = 0;
        System.out.print("Escolha a velocidade inicial: ");
        vi = in.nextDouble();
        double ace = 0;
        System.out.print("Escolha a aceleração: ");
        ace = in.nextDouble();
        double t = 0;
        System.out.print("Escolha o tempo: ");
        t = in.nextDouble();
        System.out.println("A velocidade final será: " + ((ace*t) * vi));    }
}