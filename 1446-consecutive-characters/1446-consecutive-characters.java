class Solution {
    public int maxPower(String s) {
        int cnt=1,max=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i) == s.charAt(i-1)){
                cnt++;
                max = Math.max(max,cnt);
            }else{
                cnt=1;
            }
        }
        return max;
    }
}