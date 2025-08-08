class Solution {
    public int reverse(int x) {
    int num = 0;

    while(x!=0){
    num = (num*10)+x%10;
    x = x/10;
         }
         if((num > -2147483648) && (num < 2147483647)){
             return num;
         }
        else{ return 0;
        }
    }
}