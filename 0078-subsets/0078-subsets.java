class Solution {
public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    helper(list, new ArrayList<>(), nums);
    return list;
}

private static void helper(List<List<Integer>> list, List<Integer> temp, int[] nums){
    if(nums.length == 0){
        //checking if temp we're gonna add is a duplicate or not
        for(List<Integer> oh : list){
            if(temp.equals(oh)) return;
        }    
        list.add(new ArrayList<>(temp));
        return;
        
    }

    temp.add(nums[0]);
    helper(list, temp, Arrays.copyOfRange(nums, 1, nums.length));
    temp.remove(temp.size()-1);
    helper(list, temp, Arrays.copyOfRange(nums, 1, nums.length));
}
}    

    