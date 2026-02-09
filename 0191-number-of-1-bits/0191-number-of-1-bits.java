class Solution {
    public int hammingWeight(int numb) {
        int numa = 0;
        while(numb!=0){
            numa = numa + (numb%2);
            numb = numb/2;
        }
        return numa;
    }
}