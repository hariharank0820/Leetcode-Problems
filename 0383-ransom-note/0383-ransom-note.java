class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch1 : m.toCharArray()){
            hm.put(ch1,hm.getOrDefault(ch1,0)+1);
        }
        for(char ch2 : r.toCharArray()){
            if(!hm.containsKey(ch2) || hm.get(ch2)==0){
                return false;
            }
            hm.put(ch2,hm.get(ch2)-1);
        }
        return true;
    }
}