public class Maximum69Number {

    public int maximum69Number(int num) {
        String s = String.valueOf(num);
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '6') {
                arr[i] = '9';
                break;
            }
        }
        return Integer.parseInt(new String(arr));
    }

    public static void main(String[] args) {
        Maximum69Number sol = new Maximum69Number();

        int result = sol.maximum69Number(9669);
        System.out.println(result);   // print result
    }
}
