class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int totalWork = 0;
        for(int i=0;i<hours.length;i++){
            if(hours[i] >= target){
                totalWork++;
            }
        }
        return totalWork;
    }
}