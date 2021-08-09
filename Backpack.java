public class Backpack {
    public int knapsack (int V, int n, int[][] vw) {
        int[] dp = new int[V+1];
        for(int i = 0;i < n;i++){
            for(int j = V;j>=1;j--){
                if(j>=vw[i][0]){
                    dp[j] = Math.max(dp[j],dp[j-vw[i][0]]+vw[i][1]);
                }
            }
        }
        return dp[V];
    }
}
