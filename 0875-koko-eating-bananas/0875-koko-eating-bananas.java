class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxSpeed=Arrays.stream(piles).max().getAsInt();
        int low=1,high=maxSpeed,ans=maxSpeed;
        while(low<=high){
            int mid=low+(high-low)/2;
            long hourSpent=totalHour(piles,mid);
            if(hourSpent<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private long totalHour(int[] piles, int speed){
        long hour = 0;
        for(int banana : piles){
            hour+=(int) Math.ceil((double)banana/speed);
        }
        return hour;
    }
}