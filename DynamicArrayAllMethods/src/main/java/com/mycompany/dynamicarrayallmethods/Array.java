package com.mycompany.dynamicarrayallmethods;

public class Array {

    int data[] = new int[0];

    public void addFirst(int number) {
        int[] temp = data;
        data = new int[temp.length + 1];
        data[0] = number;
        int tempIndex = 0;
        int dataIndex = 1;
        for (int i = 0; i < temp.length; i++) {
            data[dataIndex++] = temp[tempIndex++];
        }
    }

    public void addLast(int number) {
        int[] temp = data;
        data = new int[temp.length + 1];
        int tempIndex = 0;
        int dataIndex = 0;

        for (int i = 0; i < temp.length; i++) {
            data[dataIndex] = temp[tempIndex];
            dataIndex++;
            tempIndex++;
        }
        data[tempIndex] = number;
    }

    public void addIndex(int index, int number) {
        int dataIndex = 0;
        int[] temp = data;
        int tempIndex = 0;
        data = new int[temp.length + 1];
        for (int i = 0; i < index; i++) {
            data[dataIndex] = temp[tempIndex];
            tempIndex++;
            dataIndex++;
        }
        data[dataIndex] = number;
        dataIndex++;
        for (int i = index + 1; i < data.length; i++) {
            data[dataIndex] = temp[tempIndex];
            dataIndex++;
            tempIndex++;
        }

    }

    public void removeFirst() {
        int[] temp = data;
        data = new int[temp.length - 1];
        int index = 1;
        for (int i = 0; i < data.length; i++) {
            data[i] = temp[index];
            index++;
        }
    }

    public void removeLast() {
        int[] temp = data;
        data = new int[temp.length - 1];
        for (int i = 0; i < data.length; i++) {
            data[i] = temp[i];
        }
    }

    public void removeIndex(int index) {
        int tempIndex = 0;
        int dataIndex = 0;
        int[] temp = data;
        data = new int[temp.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if (i != index) {
                data[dataIndex] = temp[tempIndex];
                dataIndex++;
                tempIndex++;
            } else {
                tempIndex++;
            }
        }
    }

    public void mergeFirst(int[] arr) {
        int[] temp = data;
        int tempIndex = 0;
        data = new int[temp.length + arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }
        for (int i = arr.length; i < data.length; i++) {
            data[i] = temp[tempIndex++];
        }
    }

    public void mergeLast(int[] arr) {
        int[] temp = data;
        data = new int[data.length + arr.length];
        int arrIndex = 0;
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
        for (int i = temp.length; i < data.length; i++) {
            data[i] = arr[arrIndex++];
        }
    }

    public void mergeIndex(int[] arr, int index) {
        int[] temp = data;
        data = new int[data.length + arr.length];
        int tempIndex = 0;
        int dataIndex = 0;
        for (int i = 0; i <= data.length; i++) {
            if (i != index) {
                data[dataIndex] = temp[tempIndex];
                dataIndex++;
                tempIndex++;
            } else {
                for (int j = 0; j < arr.length; j++) {
                    data[dataIndex++] = arr[j];
                    i++;
                }
            }
        }

    }

    public int linearSearch(int value) {
        for (int i = 0; i <= data.length-1; i++) {
            if (value == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(int number) {
        int left = 0;
        int right = data.length-1;
        int mid = left + (right - left) / 2;
        while (left <= right) {
            if (data[mid] == number) {
                return mid;
            }
            if (data[mid] > number) {
                right = mid - 1;
            }
            if (data[mid] < number) {
                left = mid + 1;
            }
            mid = left + (right - left) / 2;
        }
        return -1;
    }

    public int getFirst() {
        if (data.length-1 >= 0) {
            return data[0];
        }
        return -1;
    }

    public int getLast() {
        if (data.length-1 >= 0) {
            return data[data.length-1];
        }
        return -1;
    }

    public int getIndex(int index) {
        if (index >= 0 && index <= data.length-1 && data.length-1 >= 0) {
            return data[index];
        }
        return -1;
    }

    public void viewFirst() {
        if (data.length-1 >= 0) {
            System.out.println(data[0]);
        } else {
            System.out.println("Error");
        }
    }

    public void viewLast() {
        if (data.length-1 >= 0) {
            System.out.println(data[data.length-1]);
        } else {
            System.out.println("Error");
        }
    }

    public void viewIndex(int index) {
        if (index >= 0 && index <= data.length-1 && data.length-1 >= 0) {
            System.out.println(data[index]);
        } else {
            System.out.println("Error");
        }
    }

    public boolean ascendingSort() {
        if (data.length-1 > 0) {
            int temp = 0;
            for (int i = 0; i < data.length-1; i++) {
                for (int j = i + 1; j <= data.length-1; j++) {
                    if (data[i] > data[j]) {
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

    public boolean descendingSort() {
        if (data.length-1 > 0) {
            int temp = 0;
            for (int i = 0; i < data.length-1; i++) {
                for (int j = i + 1; j <= data.length-1; j++) {
                    if (data[i] < data[j]) {
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

    public void updateFirst(int number) {
        if (data.length-1 >= 0) {
            data[0] = number;
        } else {
            System.out.println("Error");
        }
    }

    public void updateLast(int number) {
        if (data.length-1 >= 0) {
            data[data.length-1] = number;
        } else {
            System.out.println("Error");
        }
    }

    public void updateIndex(int index, int value) {
        if (data.length-1 >= 0 && index >= 0 && index <= data.length-1) {
            data[index] = value;
        } else {
            System.out.println("Error");
        }
    }

    public int firstOccurence(int number) {
        if (data.length-1 >= 0) {
            for (int i = 0; i < data.length-1; i++) {
                if (data[i] == number) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lastOccurence(int number) {
        if (data.length-1 >= 0) {
            for (int i = data.length-1; i >= 0; i--) {
                if (data[i] == number) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println("");
    }

}
