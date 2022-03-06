/*
 * @lc app=leetcode id=1359 lang=java
 *
 * [1359] Count All Valid Pickup and Delivery Options
 */

// @lc code=start
class Solution {
    public int countOrders(int n) {
        long res = f(n*2);
        return (int)res%1000000007;
    }
    public long f(int n){
        long res = 1;
        int count = 0;
        for(int i=2; i<=n; ++i){
            res *= i;
            while(count < n/2 && res %2 == 0){
                count++;
                res/=2;
            }
            res %= 1000000007;
        }
        int div = n/2-count;
        res /= Math.pow(2, div);
        return res%1000000007;
    }
}
// @lc code=end

