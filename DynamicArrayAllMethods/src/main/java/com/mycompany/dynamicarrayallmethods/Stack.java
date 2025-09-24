package com.mycompany.dynamicarrayallmethods;

public class Stack {
private int[] data = new int[0];
private int top = -1;

public boolean push(int value){
    int[] temp = data;
    data = new int[temp.length+1];
    top++;
    int index = 0;
    for(int i = 0;i<temp.length;i++){
        data[index] = temp[index];
        index++;
    }
    data[index] = value;
    return true;
}

public int getValue(){
    return data[top];
}

public int pop(){
    int value = data[top];
    int[] temp = data;
    top--;
    data = new int[data.length-1];
    for(int i = 0;i<data.length;i++){
        data[i] = temp[i];
    }
    return value;
}


public void print(){
    for(int i = top;i>=0;i--){
        System.out.println(data[i]);
    }
    System.out.println("");
}


    
}
