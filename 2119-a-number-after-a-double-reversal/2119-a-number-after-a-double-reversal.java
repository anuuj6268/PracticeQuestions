class Solution {
    public boolean isSameAfterReversals(int num) {
        int copy = num;
        int newNum = 0;
        int secondNewNum = 0;
        while(num!=0){
        newNum = (newNum*10)+(num%10);
        num= num/10;
        }
        while(newNum!=0){
            secondNewNum = (secondNewNum*10)+(newNum%10);
            newNum = newNum/10;
        }
        if(copy==secondNewNum){
            return true;
        }
        return false;
    }
}