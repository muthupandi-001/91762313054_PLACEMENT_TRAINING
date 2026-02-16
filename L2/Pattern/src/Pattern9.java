public class Pattern9 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row < 2*n; row++) {
            int totalCol = row > n ? (2*n - row) : row;
            int noOfSpace = n - totalCol;
            for(int s = 0; s < noOfSpace; s++) {
                System.out.print(" ");
            }
            for(int col = 1; col <= 2*totalCol - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

