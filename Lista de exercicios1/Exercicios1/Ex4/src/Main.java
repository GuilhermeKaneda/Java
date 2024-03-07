import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double med1 = 0;
        System.out.print("Escolha a primeira nota: ");
        med1 = in.nextDouble();
        double med2 = 0;
        System.out.print("Escolha a segunda nota: ");
        med2 = in.nextDouble();
        System.out.println("A média das notas é: " + ((med1+med2)/2));    }
}