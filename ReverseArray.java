
package com.mycompany.arraysaturday;


public class ReverseArray {
    
    
       int [] arr = {1,2,3,4,5,6};
       
public void reverseArray(){
 int temp = 0;
    System.out.println("Before Reverse : ");
    System.out.print("{");
     for(int t:arr){
        
        System.out.print(t);
        if(t!=arr[arr.length-1]){
        System.out.print(",");
        }
    }
     System.out.print("}");
 
 
 
    for(int i = 0;i<arr.length/2;i++){
        temp = arr[arr.length-i-1];
        arr[arr.length-i-1]=arr[i];
        arr[i]=temp;
    }
     System.out.println("");
     System.out.println("After Reverse : ");
    System.out.print("{");

    for(int t:arr){
        
        System.out.print(t);
        if(t!=arr[arr.length-1]){
        System.out.print(",");
        }
    }
        System.out.print("}");

}    
}
