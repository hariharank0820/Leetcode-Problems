class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        if(x==0) return true;
        long rev=0;
        long div=1;
        while(div<=x){
            long ld=(x%(div*10))/div;
            rev = rev * 10 + ld;
            div*=10;
        }
        return x==rev;
    }
}