package com.schmollgruber.algorithms.services;

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
            RunnableDemo thR = new RunnableDemo("t"+th);
            thR.start();

        }

        // Sorting Algo-part

        int[] randomList = new int[n];
        for (int i = 0; i < n; i++) {
            randomList[i] = (int) ( Math.random() * 1000000 );
        }
        this.sortingQuickSortService.sort(randomList);

    }
}
