class Solution {
    public int hammingWeight(int n) {
        int num = 0;
        while(n!=0){
            num = num + (n%2);
            n = n/2;
        }
        return num;
    }
}