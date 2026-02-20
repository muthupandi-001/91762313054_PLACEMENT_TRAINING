public class LargestOddNumberInString {

    public String largestOddNumber(String num) {

        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';

            if (digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }

        return "";
    }

    public static void main(String[] args) {
        LargestOddNumberInString obj = new LargestOddNumberInString();

        System.out.println(obj.largestOddNumber("52"));
        System.out.println(obj.largestOddNumber("4206"));
        System.out.println(obj.largestOddNumber("35427"));
    }
}
