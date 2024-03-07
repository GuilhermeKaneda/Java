import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double money;
        byte drink;
        List<Double> prices = new ArrayList<>();
        prices.add(0.50);
        prices.add(1.00);
        prices.add(2.50);
        prices.add(2.00);
        
        System.out.print("Insira o dinheiro: ");
        money = in.nextDouble();
        System.out.println("\nMenu:");
        System.out.println("1. Café Expresso R$ 0,50\n2. Café Longo R$ 1,00\n" +
                "3. Capuccino R$ 2,50\n4. Chocolate R$ 2,00");
        System.out.print("\nEscolha uma opção: ");
        drink = in.nextByte();
        drink -= 1;

        if (money >= prices.get(drink)){
            switch (drink) {
                case 0:
                    System.out.print("\nBebida selecionada: Café Expresso");
                    System.out.print("\nSeu troco: " + (money - prices.get(drink)));
                    break;
                case 1:
                    System.out.print("\nBebida selecionada: Café Longo");
                    System.out.print("\nSeu troco: " + (money - prices.get(drink)));
                    break;
                case 2:
                    System.out.print("\nBebida selecionada: Capuccino");
                    System.out.print("\nSeu troco: " + (money - prices.get(drink)));
                    break;
                case 3:
                    System.out.print("\nBebida selecionada: Chocolate");
                    System.out.print("\nSeu troco: " + (money - prices.get(drink)));
                    break;
            }
        }
    }
}
