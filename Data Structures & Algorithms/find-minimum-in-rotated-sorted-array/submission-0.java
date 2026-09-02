class Solution {
    public int findMin(int[] nums) {
        return Arrays.stream(nums).boxed().sorted().findFirst().get();
    }
}
