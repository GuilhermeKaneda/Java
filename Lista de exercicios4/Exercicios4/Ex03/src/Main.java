import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, n2;
        boolean m = false;
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            n = in.nextInt();
            numbers.add(n);
        }

        System.out.print("Escolha um número: ");
        n2 = in.nextInt();

        for(int j = 0; j < 10; j++) {
            if (numbers.get(j) == n2) {
                System.out.println("Valor encontrado");
                m = true;
            }
        }

        if(m == false) {
            System.out.println("Valor não encontrado");
        }
    }
}