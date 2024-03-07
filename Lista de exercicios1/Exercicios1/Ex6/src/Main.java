import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double ms = 0;
        System.out.print("Escolha uma velociade, em M/S: ");
        ms = in.nextDouble();
        System.out.println("A velocidade em, KM: " + (ms / 3.6));
    }
}