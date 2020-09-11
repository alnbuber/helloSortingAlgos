package com.schmollgruber.algorithms.services.algorithms;

import java.util.Arrays;

public class MergeSort extends Thread {

    public final String algorithmName = "Merge Sort";

    Thread t;
    private String name;
    private int[] A;

    public MergeSort(int[] a, String name) {
        A = a;
        this.name = name;
    }

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

        System.out.println("\nResult of sorting: - process: " +  this.name + "\n");
        Arrays.stream(A).forEach( a -> {
            System.out.println(a + ", ");
        });

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
        int[] copyA = Arrays.copyOf(A, A.length);

        return copyA;
    }


    @Override
    public void run() {
        try {
            Thread.sleep(50);

            if(this.A == null) {
                this.A = new int[]{};
            } else {
                this.mergeSort(this.A);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        System.out.println("Run " + this.algorithmName + " - process: " +  this.name);

        if( this.t == null) {
            this.t = new Thread(this, this.name);
            t.start();
        }

    }

}
