class Solution {
    public int maxLoot(int[] nums,int idx, int end ,int[] dp) {
       if(idx > end) return 0;
       if(dp[idx] != -1) return dp[idx];

       int steal = nums[idx] + maxLoot(nums,idx + 2,end,dp);
       int skip  = maxLoot(nums,idx +1,end,dp);

       return dp[idx] = Math.max(steal,skip); 
    }
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1){
            return nums[0];
        }
        int[] dp1  = new int[n];
        Arrays.fill(dp1,-1);
        int case1 = maxLoot(nums,0,n-2,dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        int case2 = maxLoot(nums,1,n-1,dp2);

        return Math.max(case1,case2);
    }
}
