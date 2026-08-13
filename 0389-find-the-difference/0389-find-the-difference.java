class Solution {
    public char findTheDifference(String s, String t) {
        int total1=0;
        int total2=0;
        for(int i=0;i<s.length();i++){
            total1 += s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            total2 += t.charAt(j);
        }
        int grandTotal=total2-total1;
        return (char) grandTotal;
    }
}