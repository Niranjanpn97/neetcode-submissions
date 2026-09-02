class Solution {
    public int[] countBits(int n) {
         int[] res = new int[n+1];
        for(int i=0;i<=n;i++)
        {
            res[i] = Integer.bitCount(i);
        }
        Arrays.stream(res).forEach(System.out::println);


          return res;
    }
}
