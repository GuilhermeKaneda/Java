import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        System.out.print("Escolha um número: ");
        n = in.nextInt();

        switch (n) {
            case 1:
                System.out.print("O dia é Domingo.");
                break;

            case 2:
                System.out.print("O dia é Segunda-Feira.");
                break;

            case 3:
                System.out.print("O dia é Terça-Feira.");
                break;

            case 4:
                System.out.print("O dia é Quarta-Feira.");
                break;

            case 5:
                System.out.print("O dia é Quinta-Feira.");
                break;

            case 6:
                System.out.print("O dia é Sexta-Feira.");
                break;

            case 7:
                System.out.print("O dia é Sábado.");
                break;

        }
    }
}