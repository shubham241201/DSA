class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 && matrix[0].length == 0) return false;
        for(int i = 0; i < matrix.length; i++){
            int left =0;
            int right = matrix[0].length-1;

            while(left <= right){
                int mid = left + (right  - left)/2;
                if(matrix[i][mid] == target){
                      return true;
                }  
                else if(matrix[i][mid] < target){
                    left = mid + 1;
                }
                else if(matrix[i][mid] > target){
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}