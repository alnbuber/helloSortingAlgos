package com.schmollgruber.algorithms.controller;

import com.schmollgruber.algorithms.services.SortingMergeSortService;
import com.schmollgruber.algorithms.services.SortingQuickSortService;
import com.schmollgruber.algorithms.services.ThreadAlgorithms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/algo")
public class AlgorithmController {

    @Autowired
    SortingMergeSortService mergeSort;

    @Autowired
    SortingQuickSortService quickSort;

    @Autowired
    ThreadAlgorithms threadAlgorithms;

    @GetMapping("/mergeSort")
    public String mergeSort() {
        this.mergeSort.mergeSort(new int[]{1,3,2,5,4,9,6,10,7, -10, 100, 0, 11});
        return "Merge Sort";
    }

    @GetMapping("/quickSort")
    public String quickSort() {
        this.quickSort.sort(new int[]{1,3,2,5,4,9,6,10,7, -10, 100, 0, 11});
        return "quick Sort";
    }

    @GetMapping("/thread")
    public String thread(@RequestParam int n, @RequestParam int t){
        this.threadAlgorithms.doSomething(n, t);
        return "threads learn";
    }
}
