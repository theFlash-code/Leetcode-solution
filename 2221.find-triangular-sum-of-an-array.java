class Solution {
    public int triangularSum(int[] nums) {
        int[][] tri = new int[nums.length][nums.length];
        tri[0][0] = 1;
        for(int i=0; i<nums.length-1; ++i){
            for(int j=0; j<i+1; ++j){
                tri[i+1][j] += tri[i][j]%10;
                tri[i+1][j+1] += tri[i][j]%10;
            }
        }
        
        int res = 0;
        int[] t = tri[nums.length-1];
        
        for(int i=0; i<nums.length; ++i){
            res += (nums[i]*t[i]);
            res %= 10;
        }
        return res;
    }
}