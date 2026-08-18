class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> hm = new HashMap<>();
        for(String S : strs){
            int[] count = new int[26];
            for(char ch : S.toCharArray()){
                count[ch - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
                for(int val : count){
                    sb.append(val).append("#");
                }
            String key = sb.toString();
            if(hm.containsKey(key)){
                hm.get(key).add(S);
            }else{
                List<String> st = new ArrayList<>();
                st.add(S);
                hm.put(key,st);
            }
        }
        for (List<String> list : hm.values()) {
            ans.add(list);
        }
        return ans;
    }
}