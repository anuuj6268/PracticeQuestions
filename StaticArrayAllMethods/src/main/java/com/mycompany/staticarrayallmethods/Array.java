package com.mycompany.staticarrayallmethods;

public class Array {
int data[] = {};
int currentPosition = -1;

public Array(int size){
    data = new int[size];
}

public boolean addFirst(int number){
    if(currentPosition<data.length){
        currentPosition++;
        for(int i = currentPosition;i>=0;i--){
            data[i+1] = data[i];
        }
        data[0] = number;
        return true;
    }
    return false;
}
public boolean addLast(int number){
    if(currentPosition<data.length){
        currentPosition++;
        data[currentPosition] = number;
        return true;
    }
    return false;
}

public boolean addIndex(int index,int number){
    if(currentPosition<data.length && index>=0 && index<data.length){
        currentPosition++;
        for(int i = currentPosition;i>=index;i--){
            data[i] = data[i-1];
        }
        data[index] = number;
        return true;
        
    }
    return false;
}

public boolean removeFirst(){
    if(currentPosition>=0){
        for(int i = 0;i<=currentPosition;i++){
            data[i] = data[i+1];
        }
        currentPosition--;
        return true;
    }
    return false;
}

public boolean removeLast(){
    if(currentPosition>=0){
        currentPosition--;
        return true;
    }
    return false;
}

public boolean removeIndex(int index){
    if(index>=0 && index<=currentPosition && currentPosition<data.length){
        for(int i = index;i<=currentPosition;i++){
            data[i] = data[i+1];
        }
        currentPosition--;
        return true;
    }
    return false;
}

public int linearSearch(int value){
    for(int i = 0;i<=currentPosition;i++){
        if(value==data[i]){
            return i;
        }
    }
    return -1;
}

public int binarySearch(int number){
    int left = 0;
    int right = currentPosition;
    int mid = left + (right - left)/2;
    while(left<=right){
        if(data[mid] == number){
            return mid;
        }
        if(data[mid]>number){
            right = mid-1;
        }
        if(data[mid]<number){
            left = mid+1;
        }
        mid = left + (right-left)/2;
    }
    return -1;   
}
public int getFirst(){
    if(currentPosition>=0){
        return data[0];
    }
    return -1;
}

public int getLast(){
    if(currentPosition>=0){
        return data[currentPosition];
    }
    return -1;
}

public int getIndex(int index){
    if(index>=0 && index<=currentPosition && currentPosition>=0){
            return data[index];
    }
    return -1;
}
 
public void viewFirst(){
    if(currentPosition>=0){
        System.out.println(data[0]);
    }
    else{
        System.out.println("Error");
    }
}
public void viewLast(){
    if(currentPosition>=0){
        System.out.println(data[currentPosition]);
    }
    else{
        System.out.println("Error");
    }
}
public void viewIndex(int index){
    if(index>=0 && index<=currentPosition && currentPosition>=0){
        System.out.println(data[index]);
    }
    else{
        System.out.println("Error");
    }
            }

public boolean ascendingSort(){
    if(currentPosition>0){
        int temp = 0;
        for(int i = 0;i<currentPosition;i++){
            for(int j = i+1;j<=currentPosition;j++){
                if(data[i]>data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return true;
    }
    return false;   
}

public boolean descendingSort(){
    if(currentPosition>0){
        int temp = 0;
        for(int i = 0;i<currentPosition;i++){
            for(int j = i+1;j<=currentPosition;j++){
                if(data[i]<data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
        return true;
    }
    return false;
}

public boolean mergeFirst(int[] arr){
    int requiredLength = arr.length;
    int availableLength = data.length - currentPosition;
    if(availableLength>=requiredLength){
        
        for(int i = currentPosition;i>=0;i--){
            data[i+requiredLength] = data[i];
        }
        currentPosition = currentPosition+requiredLength;
        for(int i = 0;i<arr.length;i++){
            data[i] = arr[i];
        }
        return true;
    }
    return false;
}

public boolean mergeLast(int[] arr){
    int requiredLength = arr.length;
    int totalLength = arr.length+currentPosition;
    int availableLength = data.length - currentPosition;
    if(availableLength>=requiredLength){
    int index = 0;        
        for(int i = currentPosition+1;i<=totalLength;i++){
            data[i] = arr[index++];
        }
        currentPosition = currentPosition + requiredLength;
        return true;
    }
    return false;
}

public boolean mergeIndex(int[] arr,int index){
    int requiredLength = arr.length;
    int totalLength = arr.length+currentPosition;
    int availableLength = data.length - currentPosition;
    if(availableLength>=requiredLength){
        int index2 = 0;
        for(int i = currentPosition;i>=index;i--){
            data[i+requiredLength] = data[i];
        }
        for(int i = index;i<index+arr.length;i++){
            data[i] = arr[index2++];
        }
        currentPosition = currentPosition + requiredLength;
        return true;
    }
    return false;
}

public void updateFirst(int number){
    if(currentPosition>=0){
        data[0] = number;
    }
    else{
        System.out.println("Error");
    }
}

public void updateLast(int number){
    if(currentPosition>=0){
        data[currentPosition] = number;
    }
    else{
        System.out.println("Error");
    }
}

public void updateIndex(int index,int value){
    if(currentPosition>=0 && index>=0 && index<=currentPosition){
        data[index] = value;
    }
    else{
        System.out.println("Error");
    }
}



public void print(){
    for(int i = 0;i<=currentPosition;i++){
        System.out.print(data[i]+" ");
    }
    System.out.println("");
}

public int firstOccurence(int number){
    if(currentPosition>=0){
        for(int i = 0;i<currentPosition;i++){
            if(data[i]==number){
                return i;
            }
        }
    }
return -1;
}
public int lastOccurence(int number){
    if(currentPosition>=0){
        for(int i = currentPosition;i>=0;i--){
           if(data[i]==number){
               return i;
           }
        }
    }
return -1;
}

}
