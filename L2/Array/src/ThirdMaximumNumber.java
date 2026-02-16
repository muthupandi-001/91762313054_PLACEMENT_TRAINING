import java.util.*;
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        int last = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != last) {
                count++;
                last = nums[i];
            }
            if (count == 3)
                return nums[i];
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        ThirdMaximumNumber sol = new ThirdMaximumNumber();
        int[] nums = new int[]{3,2,1};
        System.out.println(sol.thirdMax(nums));
    }
}

