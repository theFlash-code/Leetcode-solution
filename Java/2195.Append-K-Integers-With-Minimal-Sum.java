class Solution {
    public long minimalKSum(int[] nums, int k) {
        long res=k*(k+1)/2;
        if(k%2 == 0){
            res = k/2;
            res *= k+1;
        }else{
            res = (k+1)/2;
            res *= k;
        }
        Arrays.sort(nums);
        int prev = 0;
        for(int i=0; i<nums.length; ++i){
            if(nums[i]<=k && nums[i] != prev){
                k++;
                res -= nums[i];
                res += k;
                prev = nums[i];
            }
        }
        return res;
    }
}