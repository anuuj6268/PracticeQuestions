class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr[] = new int[temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        for(int i = 0;i<temperatures.length;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                arr[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return arr;
     }
}