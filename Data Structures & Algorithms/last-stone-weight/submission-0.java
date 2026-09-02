class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        for(int n:stones)
        {
            heap.offer(n);
        }
        while(heap.size()>1)
        {
            int y = heap.poll();
            int x = heap.poll();
            if(x<y)
            {
                int rem = y-x;
                heap.offer(rem);
            }
        }
        return heap.isEmpty()?0:heap.poll();
        
    }
}
