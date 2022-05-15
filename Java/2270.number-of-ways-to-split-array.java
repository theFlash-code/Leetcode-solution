class Solution {
    public int waysToSplitArray(int[] nums) {
        long cur = 0, sum = 0;
        for(int i=0; i<nums.length; ++i){
            sum += nums[i];
        }
        int cnt = 0;
        for(int i=0; i<nums.length-1; ++i){
            cur += nums[i];
            if(cur >= sum-cur) cnt++;
        }
        return cnt;
    }
}