package task1;

public class MultTable {

    public static void main(String[] args) throws Exception {
        printMultTable();
    }

    private static void printMultTable(){
        StringBuilder strBuilder = new StringBuilder();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                strBuilder.append(i).append(" x ").append(j).append(" = ").append(i*j).append("\n");
            }
        }
        System.out.println(strBuilder.deleteCharAt(strBuilder.length() - 1));
    }
}
