class Solution {
    public int maxArea(int[] heights) {
        int lo = 0, hi = heights.length - 1, best = 0;
        while (lo < hi) {
            int area = (hi - lo) * Math.min(heights[lo], heights[hi]);
            best = Math.max(best, area);
            if (heights[lo] < heights[hi]) lo++; else hi--;
        }
        return best;
    }
}
