class Solution {
public static int getSum(int num){
         int sum = 0;  
        while(num!=0){
        sum = sum + (num%10);
        num = num/10;
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