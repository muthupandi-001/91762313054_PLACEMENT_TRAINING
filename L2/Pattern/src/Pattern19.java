public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for(int row = 1; row <= 2*n; row++) {
            int stars = row <= n ? n - row + 1 : row - n;
            int spaces = 2 * (n - stars);
            for(int i = 1; i <= stars; i++)
                System.out.print("*");
            for(int i = 1; i <= spaces; i++)
                System.out.print(" ");
            for(int i = 1; i <= stars; i++)
                System.out.print("*");
            System.out.println();
        }
    }
}

