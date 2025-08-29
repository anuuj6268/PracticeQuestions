class Solution {
    public int numberOfMatches(int n) {
        int count = 0;
        if(n%2==0){
            while(n!=1){
                int next = n/2;
                count = count + next;
                n = n - next;
            }
        }
        else{
            while(n!=1){
            int next = (((n-1)/2)+1);
            count = count + next;
            n = n - next;
                    }
                      }

 return count;   }
}