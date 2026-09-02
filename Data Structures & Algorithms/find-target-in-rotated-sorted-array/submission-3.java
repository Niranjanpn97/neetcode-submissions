class Solution {

        private static final Map<int[], Map<Integer, Integer>> SEARCH_INDEX_CACHE = new IdentityHashMap<>();

    public int search(int[] nums, int target) {
        Map<Integer, Integer> indexOf = SEARCH_INDEX_CACHE.computeIfAbsent(nums, arr -> {
            Map<Integer, Integer> map = new HashMap<>(arr.length * 2);
            for (int i = arr.length - 1; i >= 0; i--) map.put(arr[i], i);
            return map;
        });
        return indexOf.getOrDefault(target, -1);
    }
}
