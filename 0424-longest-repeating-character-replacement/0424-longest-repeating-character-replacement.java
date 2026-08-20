class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequency = new int[26];
        int maxL=0,right=0,left=0,maxFreq=0;
        while(right<s.length()){
            frequency[s.charAt(right)-'A']++;
            maxFreq=Math.max(maxFreq,frequency[s.charAt(right)-'A']);
            if((right-left+1)-maxFreq > k){
                frequency[s.charAt(left)-'A']--;
                left++;
            }
            maxL=Math.max(maxL,right-left+1);
            right++;
        }
        return maxL;
    }
}