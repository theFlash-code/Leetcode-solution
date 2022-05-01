class Solution {
    public int countDistinct(int[] nums, int k, int p) {
        int st = 0, end = 0;
        int dcnt = 0;
        Set<String> set = new HashSet<>();
        for(int i=0; i<nums.length; ++i){
            StringBuilder sb = new StringBuilder();
            dcnt = 0;
            for(int j=i; j<nums.length; ++j){
                sb.append(String.valueOf(nums[j])+",");
                if(nums[j]%p == 0){
                    dcnt++;
                }
                if(dcnt <= k){
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }
}