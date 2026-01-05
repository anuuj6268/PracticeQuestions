class Solution {
    public int hammingWeight(int numb) {
        int num = 0;
        while(numb!=0){
            num = num + (numb%2);
            numb = numb/2;
        }
        return num;
    }
}