class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] pre = new int[n];
        int[] suf = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]*nums[i];
        }
        suf[n-1] = nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i] = suf[i+1]*nums[i];
        }
        int lm,rm;
        for(int i=0;i<n;i++){
            if(i==0) lm=1;
            else lm=pre[i-1];
            if(i==n-1) rm=1;
            else rm=suf[i+1];
            ans[i] = lm*rm;
        }
        return ans;
    }
}