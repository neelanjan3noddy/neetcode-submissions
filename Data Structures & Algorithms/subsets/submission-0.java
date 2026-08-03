class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(result,new ArrayList<>(),nums,0);
        return result;
    }

    private void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet,int[] nums,int start){
        
        resultSets.add(new ArrayList<>(tempSet));
        for(int i =start;i<nums.length;i++){

            tempSet.add(nums[i]);

            backtrack(resultSets,tempSet,nums,i+1);

            tempSet.remove(tempSet.size() -1);
                    }
    }
}
