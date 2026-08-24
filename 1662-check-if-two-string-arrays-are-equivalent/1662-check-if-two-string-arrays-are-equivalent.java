class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one="";
        for(int i=0;i<word1.length;i++){
            one+=word1[i];
        }
        String two="";
        for(int j=0;j<word2.length;j++){
            two+=word2[j];
        }
        if(one.equals(two)){
            return true;
        }
        return false;
    }
}