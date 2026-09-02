class Solution {
    public int coinChange(int[] coins, int amount) {
        final int INF = amount + 1;
        int[] dp = new int[amount + 1];
        java.util.Arrays.fill(dp, INF);
        dp[0] = 0;
        for (int a = 1; a <= amount; a++) {
            for (int c : coins) {
                if (c <= a) {
                    dp[a] = Math.min(dp[a], dp[a - c] + 1);

                }
            }
        }
        return dp[amount] == INF ? -1 : dp[amount];
    
    }
}
