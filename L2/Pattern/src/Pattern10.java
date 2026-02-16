public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        for(int row=1;row<2*n;row++){
            int total_Col=row>n?(2*n-row):row;
            for (int col=1;col<=total_Col;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
