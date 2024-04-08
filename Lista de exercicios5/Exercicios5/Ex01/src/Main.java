import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux = 0;
        int count = 0;
        System.out.println("Escreva uma palavra: ");
        String word = in.nextLine();
        int len = word.length();
        pali(word, len, aux, count);
    }

    static int pali(String word, int len, int aux, int count) {
        if(word.charAt(aux) == word.charAt(len-aux)) {
            count++;
        }

        aux++;

        if(aux > len) {
            if (count == len) {
                System.out.println("A palavra " + word + " é palindromo");
                return 0;
            } else {
                System.out.println("A palavra " + word + " não é palindromo");
                return 1;
            }
        }
        return pali(word, len, aux, count);
    }
}