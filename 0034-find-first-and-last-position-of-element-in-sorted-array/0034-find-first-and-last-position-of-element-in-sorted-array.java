class Solution {
    public int[] searchRange(int[] nums, int target) {
        int MyFirst=first(nums,target);
        int MyLast=last(nums,target);
        return new int[]{MyFirst,MyLast};
    }
    static int first(int[] nums,int target){
        int low=0,high=nums.length-1;
        int fst = -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                fst=mid;
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return fst;
    }
    static int last(int[] nums, int target){
        int low=0,high=nums.length-1;
        int lst = -1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid] == target){
                lst=mid;
                low=mid+1;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return lst;
    }
}