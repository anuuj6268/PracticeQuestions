class Solution {
    public int countDigits(int num) {
        int count = 0;
        int copy = num;
        int last1 = 0;
        while(num>0){
            last1 = num%10;
            if(copy%last1==0){
                count++;
            }
            

        num = num/10;

        }
        return count;
    }
}
