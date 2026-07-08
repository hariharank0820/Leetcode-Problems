class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int i =0,j = 0;
        int length=0;
        while(j<s.length()){
            if(hs.contains(s.charAt(j))){
                hs.remove(s.charAt(i));
                i++;
            }else{
                length = Math.max(length,j-i+1);
                hs.add(s.charAt(j));
                j++;
            }
        }
        return length;
    }
}