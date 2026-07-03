class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum=0,max=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        int st=1,end=k;
        while(end<arr.length){
            sum=sum-arr[st-1]+arr[end];
            max =Math.max(sum,max);
            st++;
            end++;
        }
        return max/k;
    }
}