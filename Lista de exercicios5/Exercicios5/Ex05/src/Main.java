import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, n2, i = 0, j = 0, aux = 0, test = 0, aux2 = 0, aux3 = 0;
        System.out.print("Qual o tamanho do vetor: ");
        n = in.nextInt();
        int [] vetor = new int [n];
        dig(vetor, i, n);
        i = 0;
        orde(vetor, n, aux, i, j);
        for(int k = 0; k < n; k++) {
            System.out.print(vetor[k] + " ");
        }
        System.out.print("\nQual o número quer procurar: ");
        n2 = in.nextInt();
        aux = n-1;
        search(n, n2, vetor, aux, test, aux2, aux3);
    }

    static int dig(int [] vetor, int i, int n) {
        Scanner in = new Scanner(System.in);
        if(i < n) {
            vetor[i] = in.nextInt();
            i++;
            return dig(vetor, i, n);
        } else {
            return 0;
        }
    }

    static int orde(int [] vetor, int n, int aux, int i, int j) {
        if(vetor[i] < vetor[j]) {
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

        j++;

        if(j >= n) {
            i++;
            j = 0;
        }

        if(i >= n) {
            return 0;
        }

        return orde(vetor, n, aux, i, j);
    }

    static int search(int n, int n2, int [] vetor, int aux, int test, int aux2, int aux3) {
        if(aux % 2 != 0 && aux > n2) {
            System.out.println("Posição " + aux + " impar");
            if (vetor[aux] == n2) {
                System.out.println("Número encontrado. Posição: " + (aux));
                return 0;
            }
            aux -= 1;
            System.out.println("Atualizado para: " + aux);
            if (vetor[aux] == n2) {
                System.out.println("Número encontrado. Posição: " + (aux));
                return 0;
            }
            return search(n, n2, vetor, aux, test, aux2, aux3);
        }

        if(vetor[aux] == n2) {
            System.out.println("Número encontrado. Posição: " + aux);
            return 0;
        }

        if(vetor[aux] > n2) {
            System.out.println("Numero menor que a posição: " + aux);
            //aux3 guarda o valor antes de diminuir, para caso precise aumentar para pegar a metade dessa numero e do proximo
            aux3 = aux;
            if(aux2 > 0) {
                aux -= (aux - aux2)/2;
            } else {
                aux = aux/2;
            }
            System.out.println("Atualizado para: " + aux);
            if(vetor[aux] == n2) {
                System.out.println("Número encontrado. Posição: " + ((aux)));
                return 0;
            }
            //Caso o aux passe pelo mesmo numero, quer dizer que o numero escolhido n esta no array
            if(aux == test) {
                System.out.println("Número não encontrado");
                return 1;
            }
            test = aux;
            return search(n, n2, vetor, aux, test, aux2, aux3);
        }

        if(vetor[aux] < n2){
            System.out.println("Número maior que a posição: " + aux);
            //aux2 guarda o valor antes de aumentar, para caso precise diminuir para pegar a metade dessa numero e do proximo
            aux2 = aux;
            aux = (aux+aux3)/2;
            System.out.println("Atualizado para: " + aux);
            if(vetor[aux] == n2) {
                System.out.println("Número encontrado. Posição: " + ((aux)));
                return 0;
            }
            //Caso o aux passe pelo mesmo numero, quer dizer que o numero escolhido n esta no array
            if(aux == test) {
                System.out.println("Número não encontrado");
                return 1;
            }
            test = aux;
            return search(n, n2, vetor, aux, test, aux2, aux3);
        }

        return search(n, n2, vetor, aux, test, aux2, aux3);
    }
}