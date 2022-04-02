class Solution {
    public int maximumTop(int[] nums, int k) {
        int max = -1;
        int len = nums.length;
        if(len == 1){
            return k%2==0? nums[0]:-1;
        }
        
        if(k<len){
            for(int i=0; i<k-1; ++i){
                max = Math.max(max, nums[i]);
            }
            if(k<nums.length) max = Math.max(max, nums[k]);
        }else if(k>len){
            for(int i=0; i<len; ++i){
                max = Math.max(max, nums[i]);
            }
        }else if(k==len){
            for(int i=0; i<k-1; ++i){
                max = Math.max(max, nums[i]);
            }
        }
        return max;
    }
}