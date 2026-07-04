class Solution {
    public int alternatingSum(int[] nums) {
        int total = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                total += nums[i];
            }else{
                total -= nums[i];
            }
        }
        return total;
    }
}