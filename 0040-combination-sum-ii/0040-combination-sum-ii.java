class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, res, new ArrayList<>(), 0);
        return res;

    }    

    private void helper(int[] candidates, int target, List<List<Integer>> res, List<Integer> temp, int index){
        if(target < 0){
            return;
        }
        else if(target == 0){
            res.add(new ArrayList<>(temp));
            return;

        } 
        else{
            for(int i = index; i < candidates.length; i++){
            if(i > index && candidates[i] == candidates[i-1]) continue; // skip duplicates
            temp.add(candidates[i]);
            helper(candidates, target - candidates[i], res, temp, i+1);
            temp.remove(temp.size()-1);
        }

        }

        
    }
}