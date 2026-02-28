class Solution {
    public void mergeSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
int mid = start + (end-start)/2;
mergeSort(arr,start,mid);
mergeSort(arr,mid+1,end);
merge(arr,start,mid,end);
    }


public void merge(int arr[],int start,int mid,int end){
int temp[] = new int [end-start+1];
int i = start;
int j = mid+1;
int index = 0;
while(i<=mid && j<=end){
    if(arr[i]<arr[j]){
        temp[index] = arr[i];
        index++;
        i++;
    }
    else{
        temp[index] = arr[j];
        index++;
        j++;
    }
}
while(i<=mid){
    temp[index++] = arr[i++];
}
while(j<=end){
    temp[index++] = arr[j++];
}

for(i = start,index = 0; index<temp.length; i++,index++){
    arr[i] = temp[index];
}

}


    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}