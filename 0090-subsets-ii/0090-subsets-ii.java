class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        helper(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    
    public static void helper(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        

        if(start >= nums.length){
            // this for loop checks if a tempList has already been added or not
            for(List<Integer> i : list){
                if(tempList.equals(i)) return;
            }
            list.add(new ArrayList<>(tempList));
            return;
        }

        tempList.add(nums[start]);
        helper(list, tempList, nums, start+1);
        tempList.remove(tempList.size()-1);
        helper(list, tempList, nums, start+1);
        
    }
}