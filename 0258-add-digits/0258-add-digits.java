class Solution {
public static int getSum(int num){
         int sums = 0;  
        while(num!=0){
        sums = sums + (num%10);
        num = num/10;
    }
    return sums;
}

    public int addDigits(int num) {
int sumValue = getSum(num);      
while(sumValue>9){
    sumValue = getSum(sumValue);
}
return sumValue;

    }
}
