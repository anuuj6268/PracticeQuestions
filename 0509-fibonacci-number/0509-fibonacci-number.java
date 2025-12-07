class Solution {
    public int fib(int num) {
        int previous = 0;
        int next = 1;
        int current = next;
        if(num==1) return 1;
        if(num==0) return 0; 
        for(int i = 2;i<=num;i++){
            current = previous + next;
            previous = next;
            next = current;
        }
    return current;
    }
}