public class ConstructRectangle {

    public int[] constructRectangle(int area) {

        int w = (int)Math.sqrt(area);

        while (area % w != 0) {
            w--;
        }

        int l = area / w;
        return new int[]{l, w};
    }

    public static void main(String[] args) {
        ConstructRectangle obj = new ConstructRectangle();

        int[] ans1 = obj.constructRectangle(4);
        System.out.println(ans1[0] + " " + ans1[1]);

        int[] ans2 = obj.constructRectangle(37);
        System.out.println(ans2[0] + " " + ans2[1]);
    }
}
