class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int n: nums){
            pq.add(n);
        }
        while(k>0){
            pq.add(pq.poll()+1);
            k--;
        }
        long mul = 1;
        while(pq.size()>0){
            mul *= pq.poll();
            mul %= 1000000007;
        }
        return (int)mul;
    }
}