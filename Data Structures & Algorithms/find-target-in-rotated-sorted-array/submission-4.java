class Solution {


    public int search(int[] nums, int target) {
       int n = nums.length;
        int[][] valueIndexPairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            valueIndexPairs[i][0] = nums[i];
            valueIndexPairs[i][1] = i;
        }
        Arrays.sort(valueIndexPairs, Comparator.comparingInt(p -> p[0])); // O(n log n)

        int lo = 0, hi = n - 1;
        while (lo <= hi) {                                               // O(log n)
            int mid = lo + (hi - lo) / 2;
            int midVal = valueIndexPairs[mid][0];
            if (midVal == target) return valueIndexPairs[mid][1];
            else if (midVal < target) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
