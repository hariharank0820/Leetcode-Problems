class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean foundVowel = false;
        boolean foundConsonent = false;
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!letters(ch)){
                return false;
            }
            if(isVowel(ch)){
                foundVowel = true;
            }else if((ch>= 'A' && ch<='Z') || (ch>= 'a' && ch<='z')){
                foundConsonent = true;
            }
        }
        return foundVowel && foundConsonent;
    }
    static boolean isVowel(char ch){
        return (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
    }
    static boolean letters(char ch){
        return ((ch>= 'A' && ch<='Z') || (ch>= 'a' && ch<='z') || (ch>= '0' && ch<='9'));
    }
}