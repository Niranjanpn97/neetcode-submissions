// import java.util.concurrent.CopyOnWriteArrayList;

class Solution {
    public int singleNumber(int[] nums) {
         List<Integer> li = new ArrayList<>();
        for(int n:nums)
        {
            if(li.contains(n))
            {
                li.removeIf(el ->el.equals(n));
            }else li.add(n);

        }
        System.out.println(!li.isEmpty() ? "ELE FOUND: "+li.get(0):"NO ELE FOUND");
        return !li.isEmpty() ? +li.getFirst():0;
        
    }
}
