class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxLen = 1;
        int curLen = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) continue;

            if (nums[i] - nums[i - 1] == 1) {
                curLen++;
                maxLen = Math.max(maxLen, curLen);
            } else {
                curLen = 1;
            }
        }
        System.out.println("Longest consecutive streak: " + maxLen);
        return maxLen;
    }
}
