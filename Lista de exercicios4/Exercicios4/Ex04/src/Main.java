import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int maior = 0;
        int menor = 0;
        List<Integer> numbers = new ArrayList<>();

        for (int j = 0; j < 10; j++) {
            n = in.nextInt();
            numbers.add(n);
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > maior) {
                maior = i;
            }
            if (numbers.get(i) < menor) {
                menor = i;
            }
        }

        System.out.println("0 maior número está na posição: " + maior);
        System.out.println("0 menor número está na posição: " + menor);
    }
}