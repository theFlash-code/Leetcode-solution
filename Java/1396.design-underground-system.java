/*
 * @lc app=leetcode id=1396 lang=java
 *
 * [1396] Design Underground System
 */

// @lc code=start
class UndergroundSystem {

    private class Data{
        String places;
        int time;
        public Data(String places, int time){
            this.places = places;
            this.time = time;
        }
    }

    Map<Integer, Data> idToTimeMap;
    Map<String, Integer> placesToTimeMap;  
    Map<String, Integer> count;
    public UndergroundSystem() {
        idToTimeMap = new HashMap<>();
        placesToTimeMap = new HashMap<>();
        count = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Data d = new Data(stationName, t);
        idToTimeMap.put(id, d);
    }
    
    public void checkOut(int id, String stationName, int t) {
        Data d = idToTimeMap.get(id);
        String key = d.places+":"+stationName;
        int times = t-d.time;
        placesToTimeMap.put(key, placesToTimeMap.getOrDefault(key, 0)+times);
        count.put(key, count.getOrDefault(key, 0)+1);
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String key = startStation+":"+endStation;
        return (double) placesToTimeMap.get(key)/count.get(key);
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
// @lc code=end

