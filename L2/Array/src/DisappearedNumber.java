import java.util.*;
public class DisappearedNumber {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found)
                ans.add(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        DisappearedNumber d = new DisappearedNumber();
        System.out.println(d.findDisappearedNumbers(new int[]{1, 2, 4, 5}));
    }
}


