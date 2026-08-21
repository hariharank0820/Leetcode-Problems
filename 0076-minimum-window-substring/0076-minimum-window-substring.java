class Solution {
    public String minWindow(String s, String t) {
        int maxLen=Integer.MAX_VALUE,right=0,left=0,stIdx=-1,cnt=0;
        int[] hash=new int[256];
        for(int i=0;i<t.length();i++){
            hash[t.charAt(i)]++;
        }
        while(right<s.length()){
            if(hash[s.charAt(right)]>0) cnt+=1;
            hash[s.charAt(right)]--;
            while(cnt == t.length()){
                if((right-left+1) < maxLen){
                    maxLen=right-left+1;
                    stIdx=left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)] > 0) cnt-=1;
                left+=1;
            }
            right+=1;
        }
        return stIdx==-1? "" : s.substring(stIdx,stIdx+maxLen);
    }
}