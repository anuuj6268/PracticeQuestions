package com.mycompany.array;
public class SecondLargest {
int[] arr = {1,5,4,3,6,4,8,9};
int n = arr.length;
public int getSecondLargest(){
    int largest = 0;
    int secondLargest = 0;
    for(int i = 0;i<n;i++){
        for(int j = 1;j<n;j++){
            if(arr[i]<arr[j]){
                largest = arr[j];
            }
        }
    }
        for(int k = 0;k<n;k++){
        for(int l = 1;l<n;l++){
            if(arr[k]<arr[l] && arr[l]<largest){
                secondLargest=arr[l];
            }
        }
    }
    return secondLargest;
}


}
