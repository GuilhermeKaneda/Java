import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            n = in.nextInt();
            numbers.add(n);
        }

        for(int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                System.out.println(numbers.get(j) + 2);
            } else {
                System.out.println(numbers.get(j) * 2);
            }
        }
    }
}