class Solution {
    public int minimumChairs(String s) {
        int max = 0, chairs = 0;
        for(char ch : s.toCharArray()){
            if(ch == 'E') chairs++;
            else if(ch == 'L') chairs--;
            max = Math.max(max,chairs);
        }
        return max;
    }
}