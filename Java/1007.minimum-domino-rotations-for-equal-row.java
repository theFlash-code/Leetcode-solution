/*
 * @lc app=leetcode id=1007 lang=java
 *
 * [1007] Minimum Domino Rotations For Equal Row
 */

// @lc code=start
class Solution {
    public int minDominoRotations(int[] top, int[] bottom) {
        int[] map = new int[6];
        int[] tmap = new int[6];
        int[] bmap = new int[6];
        int len = top.length;
        for (int i = 0; i < len; ++i) {
            tmap[top[i] - 1]++;
            bmap[bottom[i] - 1]++;
            map[top[i] - 1]++;
            if (top[i] != bottom[i])
                map[bottom[i] - 1]++;
        }
        if (map[top[0] - 1] == len) {
            return len - Math.max(tmap[top[0] - 1], bmap[top[0] - 1]);
        } else if (map[bottom[0] - 1] == len) {
            return len - Math.max(tmap[bottom[0] - 1], bmap[bottom[0] - 1]);
        } else {
            return -1;
        }
    }
}
// @lc code=end
