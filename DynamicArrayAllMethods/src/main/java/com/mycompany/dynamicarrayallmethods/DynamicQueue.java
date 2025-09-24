package com.mycompany.dynamicarrayallmethods;

public class DynamicQueue {

int[] data = new int[0];
private int rear = -1;
private int front = -1;

public boolean insert(int number){
    if(front==-1){
        front++;
    }
    int[] temp = data;
    data = new int[temp.length+1];
    for(int i = 0;i<temp.length;i++){
        data[i] = temp[i];
    }
    data[data.length-1] = number;
    rear++;
    return true;
}

public boolean remove(){
   if(rear>-1){
       int[] temp = data;
       data = new int[temp.length-1];
       int tempIndex = 1;
       for(int i = 0;i<data.length;i++){
           data[i] = temp[tempIndex];
           tempIndex++;
       }
       
       rear--;
       return true;
       
   }
    return false; 
}

public boolean update(int index,int number){
    if(index>=front && index<=rear){
        data[index] = number;
        return true;
    }
    return false;
}



public void print(){
    for(int i = front;i<=rear;i++){
        System.out.println(data[i]);
    }
}

    
}
