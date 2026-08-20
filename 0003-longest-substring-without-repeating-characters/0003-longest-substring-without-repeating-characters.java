class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hashLen=256;
        int[] h = new int[hashLen];
        Arrays.fill(h,-1);
        int l=0,r=0,maxLen=0;
        while(r<s.length()){
            if(h[s.charAt(r)] >= l){
                l=Math.max(h[s.charAt(r)] + 1,l);
            }
            int length = r-l+1;
            maxLen=Math.max(maxLen,length);
            h[s.charAt(r)]=r;
            r++;
        }
        return maxLen;
    }
}