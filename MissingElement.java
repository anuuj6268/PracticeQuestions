package com.mycompany.arraysaturday;

public class MissingElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,9};
        int sum = 0;
        for(int i = 0;i<=arr.length+1;i++){
            sum = sum+i;
        }
        int arraySum = 0;
        for(int t:arr){
            arraySum = arraySum + t;
        }    
        System.out.println(sum-arraySum);
        
        
        
    }
    
}
