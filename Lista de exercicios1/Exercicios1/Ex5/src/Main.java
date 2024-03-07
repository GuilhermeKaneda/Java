import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double km = 0;
        System.out.print("Escolha uma velocidade, em K/H: ");
        km = in.nextDouble();
        System.out.println("A velocidade em M/S é: " + (km * 3.6));    }
}