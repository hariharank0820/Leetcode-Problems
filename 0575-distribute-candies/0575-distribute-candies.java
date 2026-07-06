class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length/2;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> hs = new HashSet<>();
        for(int df : candyType){
            hs.add(df);

        }
        int dif_size = hs.size();
        min = Math.min(n,dif_size);
        return min;
    }
}