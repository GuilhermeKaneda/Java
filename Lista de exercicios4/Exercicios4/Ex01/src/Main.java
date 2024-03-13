import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            numbers.add(i+1);
        }

        for(int j = 9; j >= 0; j--) {
            System.out.print(numbers.get(j) + " ");
        }
    }
}