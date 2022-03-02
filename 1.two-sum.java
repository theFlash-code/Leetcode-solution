<<<<<<< HEAD
import java.util.HashMap;
import java.util.Map;

=======
>>>>>>> 1beafa9d73a4c035980256ac64e55b6b42bd7849
/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
<<<<<<< HEAD
        int[] res = new int[2];
        for(int i=0; i<nums.length; ++i){
            if(map.containsKey(nums[i])){
                res[0] = map.get(nums[i]);
                res[1] = i;
            }
            map.put(target-nums[i], i);
        }
        return res;
    }
}
// @lc code=end

=======
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {

        }
    }
}
// @lc code=end
>>>>>>> 1beafa9d73a4c035980256ac64e55b6b42bd7849
