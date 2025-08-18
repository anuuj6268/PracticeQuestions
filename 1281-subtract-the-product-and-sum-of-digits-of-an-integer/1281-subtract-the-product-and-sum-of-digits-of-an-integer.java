class Solution {
    public int subtractProductAndSum(int n) {
        int copy = n;
        int product = 1;
        int sum = 0;
        while(copy>0){
         product = product*(copy%10);
         sum = sum + (copy%10);
         copy = copy/10;
        }
    return product-sum;
    }
}