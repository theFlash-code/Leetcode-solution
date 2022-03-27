class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; ++i){
            if(nums[i]==key){
                int low = i-k<0?0:i-k;
                int high = i+k+1>nums.length?nums.length:i+k+1;
                // System.out.println(low+" "+high);
                for(; low<high; ++low){
                    set.add(low);
                }
            }
        }
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        return res;
    }
}