class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       List<List<Integer>> result = new ArrayList<>();
       List<Integer> current = new ArrayList<>();

        solve(candidates,target,0,current,result);
        return result;
    }

    public void solve(int[] candidates,int target,int idx,List<Integer> current,List<List<Integer>> result){
        if(target == 0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(idx == candidates.length || target < 0){
            return;
        }
        current.add(candidates[idx]);
        solve(candidates,target-candidates[idx],idx+1,current,result);
        current.remove(current.size() - 1);
         while (idx + 1 < candidates.length &&
               candidates[idx] == candidates[idx + 1]) {
            idx++;
        }
        solve(candidates,target,idx+1,current,result);

    }
}
