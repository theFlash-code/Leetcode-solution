class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<special.length; ++i){
            pq.offer(special[i]);
        }
        int floor = bottom, max = 0;
        while(!pq.isEmpty()){
            int next = pq.poll();
            max = Math.max(max, next-floor);
            floor = next+1;
        }
        max = Math.max(max, top-floor+1);
        return max;
    }
}