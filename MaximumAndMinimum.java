package com.mycompany.arraysaturday;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = {1,2,8,9,4,5,6,7};
        int minimum = arr[0];
        int maximum = arr[0];
        for(int t : arr){
            if(t>maximum){
            maximum = t;
            }
        }
        for(int t:arr){
            if(t<minimum){
                minimum = t;
            }
        }
        System.out.println("Min : "+minimum+", Max : "+maximum);
    }
    
}
