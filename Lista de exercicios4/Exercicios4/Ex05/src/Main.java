import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers2 = new ArrayList<>();
        int n;

        for(int i = 0; i < 9; i++) {
            n = in.nextInt();
            numbers.add(n);
        }

        System.out.println();

        for(int j = 8; j >= 0; j--) {
            System.out.print(numbers.get(j));
            numbers2.add(numbers.get(j));
        }
    }
}