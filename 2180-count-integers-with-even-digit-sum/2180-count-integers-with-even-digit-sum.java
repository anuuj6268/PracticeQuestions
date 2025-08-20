class Solution {
  
public static boolean isEvenSum(int number){
int sum = 0;
while(number!=0){
    sum = sum+ (number%10);
    number = number/10;
}
if(sum%2==0){
    return true;
}
return false;

}


    public int countEven(int num) {
        int count = 0;
    for(int i = 2;i<=num;i++){
        if(isEvenSum(i)){
            count++;
        }
    }

return count;

    }
}