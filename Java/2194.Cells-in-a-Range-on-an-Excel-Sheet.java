class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        String[] range = s.split(":");
        char cur = s.charAt(0), stop = s.charAt(3);
        while(cur <= stop){
            for(int i=s.charAt(1)-'0'; i<=s.charAt(4)-'0'; ++i){
                res.add((String)String.valueOf(cur)+String.valueOf(i));
            }
            cur++;
        }
        return res;
    }
}