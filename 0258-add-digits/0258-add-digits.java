class Solution {
public static int getSum(int nums){
         int sum = 0;  
        while(nums!=0){
        sum = sum + (nums%10);
        nums = nums/10;
    }
    return sum;
}

    public int addDigits(int num) {
int sumValue = getSum(num);      
while(sumValue>9){
    sumValue = getSum(sumValue);
}
return sumValue;

    }
}