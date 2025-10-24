class Solution {
    public int fib(int n) {
        int previous = 0;
        int next = 1;
        int current1 = next;
        if(n==1) return 1;
        if(n==0) return 0; 
        for(int i = 2;i<=n;i++){
            current1 = previous + next;
            previous = next;
            next = current1;
        }
    return current1;
    }
}
