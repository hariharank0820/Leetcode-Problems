class Solution {
    public boolean isPalindrome(String s) {
        char[] ch = s.toCharArray();
        int i=0,j=ch.length-1;
        while(i<j){
            if(!isLetterOrDig(ch[i])){
                i++;
            }else if(!isLetterOrDig(ch[j])){
                j--;
            }else{
                char left = isLower(ch[i]);
                char right = isLower(ch[j]);
                if(left != right){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
    static char isLower(char ch){
        if(ch>='A' && ch<='Z'){
            return (char) (ch+32);
        }
        return ch;
    }
    static boolean isLetterOrDig(char ch){
        return (ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9');
    } 
}