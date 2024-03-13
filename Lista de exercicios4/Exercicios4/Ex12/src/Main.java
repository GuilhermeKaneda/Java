import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        int n, som = 1, som2 = 1, som3 = 1, som4 = 1, som5 = 1, som6 = 1, h, i, j, o, result;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                n = in.nextInt();
                matriz[i][j] = n;
            }
            System.out.println();
        }

        for(i = 0; i < 3; i++) {
            for(j = 3; j < 5; j++) {
                matriz[i][j] = matriz[i][Math.abs(j-3)];
            }
        }

        for(h = 0; h < 3; h++) {
            som *= matriz[h][h];
        }
        System.out.println(som);

        o = 1;
        for(h = 0; h < 3; h++) {
            som2 *= matriz[h][o];
            o++;
        }
        System.out.println(som2);

        o = 2;
        for(h = 0; h < 3; h++) {
            som3 *= matriz[h][o];
            o++;
        }
        System.out.println(som3);

        o = 2;
        for(h = 0; h < 3; h++) {
            som4 *= matriz[h][o];
            o--;
        }
        System.out.println(som4);

        o = 3;
        for(h = 0; h < 3; h++) {
            som5 *= matriz[h][o];
            o--;
        }
        System.out.println(som5);

        o = 4;
        for(h = 0; h < 3; h++) {
            som6 *= matriz[h][o];
            o--;
        }
        System.out.println(som6);

        som += Math.abs(som2 + som3);
        som4 += Math.abs(som5 + som6);
        System.out.println("\n" + som);
        System.out.println(som4);

        result = som4 - som;
        System.out.println("\n" + result);
    }
}