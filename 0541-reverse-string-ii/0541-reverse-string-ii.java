class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i+=2*k){
            String firstPart=s.substring(i,Math.min(i+k,s.length()));
            StringBuilder rev = new StringBuilder(firstPart);
            rev.reverse();
            ans.append(rev);
            if(i+k < s.length()){
                String secondPart=s.substring(i+k,Math.min(i+2*k,s.length()));
                ans.append(secondPart);
            }
        }
        return ans.toString();
    }
}