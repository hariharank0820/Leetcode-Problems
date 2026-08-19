class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int len=1;len<=s.length()/2;len++){
            if(s.length()%len != 0){
                continue;
            }
            boolean isValid = true;
            for(int i=0;i<s.length();i++){
                if (s.charAt(i) != s.charAt(i % len)) {
                    isValid = false;
                    break;
                }
            }
            if(isValid){
                return true;
            }
        }
        return false;
    }
}