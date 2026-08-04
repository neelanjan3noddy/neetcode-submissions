class Solution {
    public void solve(int[] nums,int target,int idx ,List<Integer> current, List<List<Integer>> result){
        if (target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(idx == nums.length || target < 0){
            return;
        }

        current.add(nums[idx]);
      
        solve(nums,target-nums[idx],idx,current,result);
        current.remove(current.size()-1);

        solve(nums,target,idx+1,current,result);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();

        solve(nums,target,0,current,result);
        return result;
    }
}
