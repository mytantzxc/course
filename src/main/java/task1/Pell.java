package task1;

import java.util.Scanner;

public class Pell {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            System.out.println(calcPellNumber(n));
        }
    }

    private static int calcPellNumber(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int first = 0;
        int second = 1;
        for (int i = 0; i <= n - 2; i++) {
            int tmp = second;
            second = 2*second+first;
            first = tmp;
        }

        return second;
    }
}
