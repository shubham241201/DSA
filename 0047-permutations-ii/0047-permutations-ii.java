class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<> (), nums, new boolean [nums.length]);
        return res;
    }

    private static void backtrack(List<List<Integer>> resultList, List<Integer> tempList, int[] nums, boolean[] used){

        if(tempList.size() == nums.length && !resultList.contains(tempList)){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip if we get same element
            if (used[i])
                continue; 

            // Add the new element
            used[i] = true;
            tempList.add(nums[i]);

            // Go back to try other element
            backtrack(resultList, tempList, nums, used);

            // Remove the element
            used[i] = false;
            tempList.remove(tempList.size() - 1);

    }
    }
}