class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> oh = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(oh.contains(nums[i])){
                return true;
            }
            else{
                oh.add(nums[i]);
            }
        }
        return false;
    }
}