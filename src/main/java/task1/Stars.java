package task1;

import java.util.Scanner;

public class Stars {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String template = scanner.next();
            printTemplate(n, m, template);
        }
    }

    public static void printTemplate(int linesCount, int columnsCount, String template){
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 0; i < linesCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                strBuilder.append(template).append(" ");
            }
            strBuilder.deleteCharAt(strBuilder.length() - 1);
            strBuilder.append("\n");
        }
        System.out.println(strBuilder.deleteCharAt(strBuilder.length() - 1));
    }
}
