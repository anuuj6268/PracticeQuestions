class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int copy = n;
    while(n!=0){
        sum = sum + (n%10);
        product = product * (n%10);
        n = n/10;
    }
    int result = sum+product;
    if(copy%result==0){
        return true;
    }
  return false;


    }
}