class Solution {
    public String minimizeResult(String expression) {
        int min = Integer.MAX_VALUE;
        String res = expression;
        String[] strs = expression.split("\\+");
        for(int i=0; i<strs[0].length(); ++i){
            int mul = i==0?1:Integer.parseInt(strs[0].substring(0,i));
            int add = Integer.parseInt(strs[0].substring(i));
            for(int j=1; j<strs[1].length()+1; ++j){
                int add2 = Integer.parseInt(strs[1].substring(0,j));
                int mul2 = j==strs[1].length()?1:Integer.parseInt(strs[1].substring(j));
                int cur = mul*(add+add2)*mul2;
                if(cur<min){
                    min = cur;
                    res = strs[0].substring(0,i)+"("+strs[0].substring(i)+"+"+strs[1].substring(0,j)+")"+strs[1].substring(j);
                }
            }
        }
        return res;
    }
}