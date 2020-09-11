package com.schmollgruber.algorithms.services;

import com.schmollgruber.algorithms.services.algorithms.MergeSort;
import com.schmollgruber.algorithms.services.threading.RunnableDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Service
public class ThreadAlgorithms extends Thread implements Runnable {

    @Autowired
    public SortingQuickSortService sortingQuickSortService;

    @Override
    public void run() {
        System.out.println("Implement thread!");
    }

    public void doSomething(int n, int t) {

        // Threading
//        RunnableDemo t1 = new RunnableDemo("t1");
//        t1.start();


        for (int th = 0; th < t; th++) {
            System.out.println("Thread " + th);
            // generate new random Array
            int[] randomA = new int[n];
            for (int i = 0; i < n; i++) {
                randomA[i] = (int) ( Math.random() * 1000000 );
            }

            MergeSort mergeSortThread = new MergeSort(randomA, "thread-"+th);
            mergeSortThread.start();
        }

        // Sorting Algo-part
        /*int[] randomList = new int[n];
        for (int i = 0; i < n; i++) {
            randomList[i] = (int) ( Math.random() * 1000000 );
        }
        this.sortingQuickSortService.sort(randomList);*/

    }
}
