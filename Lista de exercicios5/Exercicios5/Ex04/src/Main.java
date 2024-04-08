import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int aux = 0;
        int aux2 = aux;
        int count = 0;
        System.out.println("Escreva uma palavra: ");
        String word = in.nextLine();
        int len = word.length();
        System.out.println(len);
        pali(word, len, aux, count, aux2);
    }

    static int pali(String word, int len, int aux, int count, int aux2) {
        if(word.charAt(aux) != ' ') {
            if(word.charAt(len - aux2 - 1) != ' ') {
                if (word.charAt(aux) == word.charAt(len - aux2 - 1)) {
                    count++;
                    System.out.println(count);
                }

                aux++;
                aux2++;

                if (aux >= len) {
                    if (count == len) {
                        System.out.println("A palavra " + word + " é palindromo");
                        return 0;
                    } else {
                        System.out.println("A palavra " + word + " não é palindromo");
                        return 1;
                    }
                }
                return pali(word, len, aux, count, aux2);
            } else {
                aux2++;
                return pali(word, len, aux, count, aux2);
            }
        } else {
            aux++;
            count++;
            return pali(word, len, aux, count, aux2);
        }
    }
}