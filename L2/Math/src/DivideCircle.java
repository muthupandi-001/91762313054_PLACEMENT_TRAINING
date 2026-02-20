public class DivideCircle {

    public int numberOfCuts(int n) {

        if (n == 1) return 0;

        if (n % 2 == 0)
            return n / 2;
        else
            return n;
    }

    public static void main(String[] args) {
        DivideCircle obj = new DivideCircle();

        System.out.println(obj.numberOfCuts(1));
        System.out.println(obj.numberOfCuts(2));
        System.out.println(obj.numberOfCuts(4));
        System.out.println(obj.numberOfCuts(3));
    }
}
