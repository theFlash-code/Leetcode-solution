class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for(int i=0; i<cards.length; ++i){
            int last = map.getOrDefault(cards[i], -1);
            if(last != -1){
                res = Math.min(res, i-last+1);
            }
            map.put(cards[i], i);
        }
        return res == Integer.MAX_VALUE? -1:res;
    }
}