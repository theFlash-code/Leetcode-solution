class CountIntervals {
    TreeMap<Integer, Integer> map;
    int count;
    public CountIntervals() {
        map = new TreeMap<>();
        count = 0;
    }
    
    public void add(int left, int right) {
        int start = left, end = right, gain = end-start+1;
        Map.Entry<Integer, Integer> floor = map.floorEntry(left);
        if(floor != null){
            if(floor.getValue() >= end){
                return;
            }
            if(floor.getValue() >= start){
                gain -= floor.getValue()-start+1;
                map.remove(floor.getKey());
                start = floor.getKey();
            }
        }
        
        Map.Entry<Integer, Integer> ceiling = map.ceilingEntry(left);
        while(ceiling != null && ceiling.getKey() <= end){
            gain -= Math.min(end, ceiling.getValue()) - ceiling.getKey()+1;
            map.remove(ceiling.getKey());
            end = Math.max(end, ceiling.getValue());
            ceiling = map.ceilingEntry(left);
        }
        count += gain;
        map.put(start, end);
    }
    
    public int count() {
        return count;
    }
}
