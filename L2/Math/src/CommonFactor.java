public class CommonFactor {

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public int commonFactors(int a, int b) {
        int g = gcd(a, b);
        int count = 0;

        for (int i = 1; i <= g; i++) {
            if (g % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CommonFactor obj = new CommonFactor();

        System.out.println(obj.commonFactors(12, 6));
        System.out.println(obj.commonFactors(25, 30));
    }
}