public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            for (int s = 1; s < row; s++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (2*n - (2*row - 1)); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

