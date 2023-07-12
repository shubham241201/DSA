 class Solution {
    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(nums[pivot] == target){
            return pivot;
        }
        if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length -1);

    }

    private static int findPivot(int[] nums){
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[max] < nums[i]) {
                max = i;
            }
        }
        return max;
    }

    private static int binarySearch(int[] nums, int target, int left, int right){
        while(left <= right){
            int mid = left + (right - left)/2;
            if(nums[mid] > target){
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}