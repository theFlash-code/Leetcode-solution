/*
 * @lc app=leetcode id=881 lang=java
 *
 * [881] Boats to Save People
 */

// @lc code=start
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i = people.length - 1, j = 0, cnt = 0;
        while (i >= j) {
            if (people[i] + people[j] <= limit) {
                i--;
                j++;
                cnt++;
            } else {
                cnt++;
                i--;
            }
        }
        return cnt;
    }
}

// @lc code=end
