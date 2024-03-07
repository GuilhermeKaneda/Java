import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price;
        double n2;
        int parce;
        byte pay;
        double juros;

        System.out.print("Qual o preço: ");
        price = in.nextByte();
        System.out.println("\nMenu:");
        System.out.println("1. Débito\n2. Pix\n3. Crédito\n");
        System.out.print("\nEscolha uma opção: ");
        pay = in.nextByte();

        switch (pay) {
            case 1:
                System.out.println("Débito selecionado");
                System.out.print("\nQual o número de parcelas: ");
                parce = in.nextInt();
                System.out.print("\nValor final da compra: " + (price * 0.95));
                break;
            case 2:
                System.out.print("Pix selecionado");
                System.out.print("Qual o número de parcelas: ");
                parce = in.nextInt();
                System.out.print("\nValor final da compra: " + (price*0.90));
                break;
            case 3:
                System.out.print("Crédito selecionado");
                System.out.print("Qual o número de parcelas: ");
                parce = in.nextInt();
                if (parce <= 4) {
                    juros = (price * 0.02) * parce;
                } else {
                    juros = (price * 0.05) * parce;
                }
                System.out.print("\nValor final da compra: " + (juros + price));
                break;
        }
    }
}