class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0,max = 0;
        for(int key : nums){
            hm.put(key,hm.getOrDefault(key,0)+1);
            max = Math.max(max,hm.get(key));
        }
        for(int value : hm.values()){
            if(max == value) sum+=value;
        }
        return sum;
    }
}