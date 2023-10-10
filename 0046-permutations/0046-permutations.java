class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(res, new ArrayList<>(), nums);
        return res;
    }

    private void helper(List<List<Integer>> res, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }else{
            for(int num : nums){
                if(temp.contains(num)) continue;
                temp.add(num);
                helper(res, temp, nums);
                temp.remove(temp.size()-1);
            }
        }
    }

}
