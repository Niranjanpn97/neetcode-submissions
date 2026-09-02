class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for(int j = i; j < nums.length; j++) {
            sum += nums[j];
            res = Math.max(res, sum);
        }
        }


        return res;
    }
}
