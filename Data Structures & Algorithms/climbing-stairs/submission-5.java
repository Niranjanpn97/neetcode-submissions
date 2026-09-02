class Solution {
    int[] arr;
    public int climbStairs(int n) {
        arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=-1;
        }
       return recur(n,0);
    }

    public int recur(int n,int i)
    {
         if (i >= n) return i == n ? 1 : 0;
        if(arr[i] != -1) return arr[i];
        return arr[i] = recur(n,i+1)+recur(n,i+2);
    
    }
}
