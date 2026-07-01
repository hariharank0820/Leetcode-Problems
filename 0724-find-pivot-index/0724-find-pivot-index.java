class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+nums[i];
        }
        suf[n-1] = nums[n-1];
        for(int j=n-2;j>=0;j--){
            suf[j] = suf[j+1] + nums[j];
        }
        for(int k=0;k<n;k++){
            if(pre[k] == suf[k]){
                return k;
            }
        }
        return -1;
    }
}