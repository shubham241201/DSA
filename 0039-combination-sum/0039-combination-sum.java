class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int cursum = 0;
        backtrack(res, new ArrayList<>(), target, candidates, cursum, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> temp, int target, int[] candidates, int cursum, int index){
        if(cursum == target){
            res.add(new ArrayList<>(temp));
            return;
        }
        if(index >= candidates.length || cursum > target){
            return;
        }

        temp.add(candidates[index]);
        backtrack(res, temp, target, candidates, cursum + candidates[index], index);
        temp.remove(temp.size()-1);
        backtrack(res, temp, target, candidates, cursum, index+1);
    }
}