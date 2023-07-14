class Solution {
    public int arrangeCoins(int n) {
        long start = 1, end = n, ans = 0;
        while(start<=end){
            long mid = start + (end-start)/2;
            long coins = ((mid)*(mid+1))/2;
            if(coins <= n){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return (int)ans;
    }
}