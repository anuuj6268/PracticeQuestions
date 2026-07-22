class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int lefty = 0;
        int right = height.length-1;
        while(lefty<right){
            int width = right-lefty;
            int area = Math.min(height[lefty],height[right])*width;
            if(area>maxArea){
                maxArea = area;
            }
            if(height[lefty]<height[right]){
                lefty++;
            }
            else{
                right--;
            }
        }
return maxArea;
    }
}