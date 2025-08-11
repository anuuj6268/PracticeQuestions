package com.mycompany.array;

public class SumOfArray {
 
    int[] arr = {1,2,3,5,4,7,8};
    
    public int getSumOfArray(){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}
