class Solution {
    public int search(int[] arr, int target) {
        if(arr.length == 0) return -1;
        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                left = mid + 1;
            }
            else if(arr[mid] > target){
                right = mid - 1;
            }
        }
        return -1;
    }
}