class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        for(int i=1; i<nums.length; ++i){
            int a = st.pop(), b = nums[i], gcd = gcd(a,b);
            while(gcd > 1){
                b = a/gcd*b;
                if(st.isEmpty()){
                    a=0;
                    break;
                }else{
                    a = st.pop();
                }
                gcd = gcd(a,b);
                System.out.println(a+" "+b+" "+gcd); 
            }
            if(a!=0)
                st.push(a);
            st.push(b);
        }
        return new ArrayList<>(st);
            
    }
    public int gcd(int a, int b){
        return b>0 ? gcd(b, a%b):a;
    }
}