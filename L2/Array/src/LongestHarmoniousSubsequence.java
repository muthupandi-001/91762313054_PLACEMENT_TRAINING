public class LongestHarmoniousSubsequence {
    public int findLHS(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == nums[i] || nums[j] == nums[i] + 1)
                    count++;
            }
            boolean hasNext = false;
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] == nums[i] + 1)
                    hasNext = true;
            }
            if (hasNext)
                maxLen = Math.max(maxLen, count);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        LongestHarmoniousSubsequence sol = new LongestHarmoniousSubsequence();
        int[] nums = new int[]{1,2,3,4};
        System.out.println(sol.findLHS(nums));
    }
}
