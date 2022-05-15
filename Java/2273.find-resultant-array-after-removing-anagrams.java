class Solution {
    public List<String> removeAnagrams(String[] words) {
        Stack<String> st = new Stack<>();
        for(int i=0; i<words.length; ++i){
            if(st.isEmpty() || !isAnagram(st.peek(), words[i])){
                st.push(words[i]);
            }
        }
        return new ArrayList<>(st);
    }
    public boolean isAnagram(String a, String b){
        if(a.length() != b.length())return false;
        int[] mapa = new int[26];
        int[] mapb = new int[26];
        for(int i=0; i<a.length(); ++i){
            mapa[a.charAt(i)-'a']++;
            mapb[b.charAt(i)-'a']++;
        }
        for(int i=0; i<26; ++i){
            if(mapa[i] != mapb[i])return false;
        }
        return true;
    }
}