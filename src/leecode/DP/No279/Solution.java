package leecode.DP.No279;

/**
 * @author 小羊Shaun
 * @version 1.0
 */
class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[0]=0;//说明n本身是平方数
        for(int i=1;i<=n;i++){
            int min =Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                if(dp[i-j*j]<min){
                    min = dp[i-j*j]+1;
                }
                dp[i]=min;
            }
        }
        return dp[n];

    }
}