package com.schmollgruber.algorithms.services;

import org.springframework.stereotype.Service;

@Service
public class SortingQuickSortService extends Thread{

    public void sort(int[] A){

        int low = 0;
        int high = A.length;

        A = quickSort(A, low, high);

        System.out.println("\nResult of sorting: \n");
        for (int i = 0; i <A.length ; i++) {
            System.out.print(A[i] + ", ");
        }
    }

    public int[] quickSort(int[] A, int low, int high) {

        int[] newA = new int[1];

        if( low < high) {

            // compute pivot integer
            int pi = partition(A, low, high);

            // apply recursion
            A = quickSort(A, low, pi);
            A = quickSort(A, pi+1, high);
        }

        return A;
    }

    public int partition(int[] A, int low, int high) {

        int pivotValue = A[high-1];

        int i = low ;

        for (int j = low; j <= high-1 ; j++) {

            if ( A[j] < pivotValue ) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i = i+1;
            }
        }

        int temp = A[i];
        A[i] = A[high-1];
        A[high-1] = temp;

        return i;
    }

    @Override
    public void run() {

    }
}
