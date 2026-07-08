class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int i=0,j=0;
        int max_length = 0;
        while(j < fruits.length){
            hm.put(fruits[j],hm.getOrDefault(fruits[j],0)+1);
            while(hm.size() > 2){
                hm.put(fruits[i],hm.getOrDefault(fruits[i],0)-1);
                if(hm.get(fruits[i])==0) hm.remove(fruits[i]);
                i++;
            }
            max_length =Math.max(max_length,j-i+1);
            j++;
        }
        return max_length;
    }
}