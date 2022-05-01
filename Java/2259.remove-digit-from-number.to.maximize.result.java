class Solution {
    public String removeDigit(String number, char digit) {
        String mString = "";
        for(int i=0; i<number.length(); ++i){
            if(number.charAt(i) == digit){
                String cur = number.substring(0, i)+number.substring(i+1);
                if(cur.compareTo(mString)>0){
                    mString = cur;
                }
            }
        }
        return mString;
    }
}