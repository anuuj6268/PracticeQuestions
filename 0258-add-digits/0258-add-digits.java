class Solution {
public static int getSum(int number){
         int sum = 0;  
        while(number!=0){
        sum = sum + (number%10);
        number = number/10;
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