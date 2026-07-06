class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int cnt = 0;
        for(int i=low;i<=high;i++){
            int digit = CountDigit(i);
            if(digit%2 != 0){
                continue;
            }
            int left = 0;
            int right = 0;
            if(digit == 2){
            left = i/10;
            right = i%10;
            }else if(digit == 4){
            left = i/100;
            right = i%100;
            }
            int leftSum = sumOfD(left);
            int rightSum = sumOfD(right);
            if(leftSum == rightSum){
                cnt++;
            }
        }
        return cnt;
    }
    static int sumOfD(int n){
        int sum = 0;
        while(n!=0){
            int ld = n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }
    static int CountDigit(int n){
        int div = 1;
        int cnt = 0;
        while(div<=n){
            cnt++;
            div*=10;
        }
        return cnt;
    }
}