class Solution {
    public int trap(int[] height) {
     int[] left = new int[height.length];
     int[] right = new int[height.length]; 
     int last = Integer.MIN_VALUE;
     for(int i = 0;i<height.length;i++){
    if(last<height[i]){
        last = height[i];
    }
    left[i] = last; 
     }
     int last2 = Integer.MIN_VALUE;
     for(int i = height.length-1;i>=0;i--){
    if(last2<height[i]){
        last2 = height[i];
    }
    right[i] = last2; 
     }

int count = 0;

for(int i = 0;i<height.length;i++){
    count = count + (Math.min(left[i],right[i])-height[i]);
}

return count;
    }
}