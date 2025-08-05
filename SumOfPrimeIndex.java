package com.mycompany.arraysaturday;

public class SumOfPrimeIndex {
   static public boolean isPrime(int num){
     int count = 0;
       
       for(int i =1;i<=num;i++){
           if(num%i==0){
              count++;
           }
       }
    if(count == 2){
        return true;
    }     
    return false;
    }
    
    static boolean isEven(int num){
        if(num%2==0){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int sum = 0;
        int[] arr={235,254,254,256,45,25,45,25,55};

        
        for(int i=2;i<arr.length;i++){
            if(isPrime(i)){
                if(isEven(arr[i])){
                sum = sum + arr[i];
                }
            }
        }    
        System.out.println(sum);
    }
    
}
