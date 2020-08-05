package com.schmollgruber.algorithms.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SortingMergeSortService {

    public final String algorithmName = "Merge Sort";

    // Source of algorithm: https://en.wikipedia.org/wiki/Merge_sort Bottom-up implementation
    public void mergeSort(int[] A) {

        // Create the list
        int n = A.length;

        int[] B = copyArray(A);


        for (int width = 1; width < n ; width = width * 2) {

            for (int i = 0; i < n; i = i + 2 * width) {

                B = merge(A, i, Math.min(i+width, n), Math.min(i+2*width, n), B);

            }

            A = copyArray(B);

        }

        System.out.println("Result of sorting: \n");
        for (int i = 0; i < n; i++) {
            System.out.print(A[i] + ", ");
        }
    }

    public int[] merge(int[] A, int iLeft, int iRight, int iEnd, int[] B ){

        int i = iLeft;
        int j = iRight;

        for (int k = iLeft; k < iEnd; k++) {

            if (i < iRight && (j >= iEnd || A[i] <= A[j])) {
                B[k] = A[i];
                i++;
            } else {
                B[k] = A[j];
                j++;
            }
        }

        return B;
    }

    public int[] copyArray(int[] A) {
        int[] copyA = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            copyA[i] = A[i];
        }

        return copyA;
    }

}
