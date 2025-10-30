class Solution {
    public int hammingWeight(int a) {
        int num = 0;
        while(a!=0){
            num = num + (a%2);
            a = a/2;
        }
        return num;
    }
}