class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:nums) {
            if(map.containsKey(n))
            {
                map.put(n,map.get(n)+1);
        }else
            {
            map.put(n,1);
            }
        }

        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(map.entrySet());

        for (int i = 0; i < k; i++) {
            res[i] = maxHeap.poll().getKey();
        }

        return res;
    }
}
