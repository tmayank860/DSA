package RandomProblems;

import java.util.Arrays;

public class CoinChange2 {
    public static void main(String[] args) {

    }

    public static int change(int amount, int[] coins) {
        int[][] dp=new int[coins.length][amount+1];
        for (int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
return recursiveCall(coins,0,amount,dp);

    }
    public static int recursiveCall(int[] coins, int indx, int amount, int[][] dp){
       if (amount==0){
           return 1;
       }
       if (amount<0||indx==coins.length){
           return 0;
       }
       if (dp[indx][amount]!=-1){
           return dp[indx][amount];
       }
        return dp[indx][amount]= recursiveCall(coins,indx,amount-coins[indx],dp)+recursiveCall(coins,indx+1,amount,dp);
    }
}
