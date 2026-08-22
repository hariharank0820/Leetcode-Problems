class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        for(char ch : word.toCharArray()){
            if(ch >= 'A' && ch<='Z'){
                count++;
            }
        }
        if(count == word.length()) return true;
        if(count == 0) return true;
        if(count == 1 && word.charAt(0)<='Z') return true;
        else return false;
    }
}