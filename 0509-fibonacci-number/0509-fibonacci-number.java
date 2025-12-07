class Solution {
    public int fib(int n) {
        int previous = 0;
        int next = 1;
        int current = next;
        if(n==1) return 1;
        if(n==0) return 0; 
        for(int i = 2;i<=n;i++){
            current = previous + next;
            previous = next;
            next = current;
        }
    return current;
    }
}