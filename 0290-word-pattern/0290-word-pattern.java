class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> Ps = new HashMap<>();
        HashMap<String,Character> Sp = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        for(int i=0;i<pattern.length();i++){
            char p = pattern.charAt(i);
            String st = arr[i];
            if(Ps.containsKey(p)){
                if(!Ps.get(p).equals(st)){
                    return false;
                }
            }else{
                Ps.put(p,st);
            }
            if(Sp.containsKey(st)){
                if(Sp.get(st) != p){
                    return false;
                }
            }else{
                Sp.put(st,p);
            }
        }
        return true;
    }
}