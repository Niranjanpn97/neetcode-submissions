class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> temp = new HashSet<>();  // deduplication: Set rejects duplicate triplets automatically
        Arrays.sort(nums);  // sort so [a,b,c] is always in same order → Set can detect duplicates

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.add(triplet);
                    }
                }
            }
        }

        result.addAll(temp);
        return result;
        
    }
}
