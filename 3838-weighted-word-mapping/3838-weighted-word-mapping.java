class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder ans = new StringBuilder();
        for(String word : words){
            int sum = 0;
            for(int i=0;i<word.length();i++){
                char ch = word.charAt(i);
                int idx = ch-'a';
                sum+=weights[idx];
            }
            int remainder = sum%26;
            char map = (char) ('z' - remainder);
            ans.append(map);
        }
        return ans.toString();
    }
}