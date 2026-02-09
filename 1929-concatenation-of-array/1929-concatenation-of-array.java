class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] arr = new int[nums.length*2]; 
       int index = 0;
        for(int i = 0;i<arr.length;i++){
            if(i==nums.length){
                index = 0;
             }
  
                arr[i] = nums[index++];
            
                  }
return arr;
    }
}