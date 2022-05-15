class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int cnt = 0;
        for(int i=0; i<str.length()-k+1; ++i){
            String cur = str.substring(i, i+k);
            // System.out.println(cur);
            int d = Integer.valueOf(cur);
            if(d!=0 && num%d == 0)cnt++;
        }
        return cnt;
    }
}