class Solution {
    public int splitArray(int[] nums, int k) {
        if(k > nums.length) return -1;
        int low=Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();
        while(low<=high){
            int mid=low+(high-low)/2;
            int partitions=cntPartitions(nums,mid);
            if(partitions <= k){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    static int cntPartitions(int[] nums,int maxSum){
        int part=1,subArrSum=0;
        for(int num : nums){
            if(subArrSum+num <= maxSum){
                subArrSum+=num;
            }else{
                part++;
                subArrSum=num;
            }
        }
        return part;
    }
}