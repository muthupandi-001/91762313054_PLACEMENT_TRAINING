public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= n; row++) {
            for(int i = 1; i <= row; i++)
                System.out.print("*");
            for(int i = 1; i <= 2*(n - row); i++)
                System.out.print(" ");
            for(int i = 1; i <= row; i++)
                System.out.print("*");
            System.out.println();
        }
        for(int row = n-1; row >= 1; row--) {
            for(int i = 1; i <= row; i++)
                System.out.print("*");
            for(int i = 1; i <= 2*(n - row); i++)
                System.out.print(" ");
            for(int i = 1; i <= row; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}

