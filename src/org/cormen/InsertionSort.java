package org.cormen;

public class InsertionSort {
    void sorter(int[] arr) {
        if (arr.length < 2) {
            return;
        }

        for (int j = 1; j < arr.length; j++) {
            int k = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > k) {
              arr[i+1] = arr[i];
              i--;
            }
            arr[i+1] = k;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        new InsertionSort().sorter(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

