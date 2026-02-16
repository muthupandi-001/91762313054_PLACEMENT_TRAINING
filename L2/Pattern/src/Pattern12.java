public class Pattern12 {
    public static void main(String[] args) {
        int n =5;
        for(int row = 1; row <= n; row++) {
            for(int col = 1; col <= row; col++)
                System.out.print(col);
            for(int s = 1; s <= 2*(n - row); s++)
                System.out.print(" ");
            for(int col = row; col >= 1; col--)
                System.out.print(col);
            System.out.println();
        }
    }
}

