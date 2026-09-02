class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<List<Integer>>> dp = new ArrayList<>(target + 1);
        for (int s = 0; s <= target; s++) dp.add(new ArrayList<>());
        dp.get(0).add(new ArrayList<>());

        for (int num : nums) {
            for (int s = num; s <= target; s++) {
                for (List<Integer> combo : dp.get(s - num)) {
                    List<Integer> newCombo = new ArrayList<>(combo);
                    newCombo.add(num);
                    dp.get(s).add(newCombo);
                }
            }
        }

        return dp.get(target);
    }
}
