public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        for(int row = 1; row <= n; row++) {
            for(int s = 1; s <= n - row; s++)
                System.out.print(" ");
            for(int col = 0; col < row; col++) {
                char ch = (char)('A' + col);
                System.out.print(ch);
            }
            for(int col = row - 2; col >= 0; col--) {
                char ch = (char)('A' + col);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}


