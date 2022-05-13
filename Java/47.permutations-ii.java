/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> preans = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Boolean[] isUsed = new Boolean[nums.length];
        Arrays.sort(nums);
        recur(nums, preans, ans, isUsed);
        return ans;
    }
    public void recur (int[] nums, List<Integer> preans, List<List<Integer>> ans, Boolean[] isUsed){
        if(preans.size() == nums.length){
            ans.add(new ArrayList<>(preans));
            return;
        }
        for(int i=0; i<nums.length; ++i){
            if(Boolean.TRUE.equals(isUsed[i]) || i>0 && nums[i] == nums[i-1] && !isUsed[i-1])continue;
            
            isUsed[i] = true;
            preans.add(nums[i]);
            recur(nums, preans, ans, isUsed);
            isUsed[i] = false;
            preans.remove(preans.size()-1);
        }
    }
}
// @lc code=end

