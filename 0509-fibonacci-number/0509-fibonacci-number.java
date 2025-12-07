class Solution {
    public int fib(int number) {
        int previous = 0;
        int next = 1;
        int current = next;
        if(number==1) return 1;
        if(number==0) return 0; 
        for(int i = 2;i<=number;i++){
            current = previous + next;
            previous = next;
            next = current;
        }
    return current;
    }
}