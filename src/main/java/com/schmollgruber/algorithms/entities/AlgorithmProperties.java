package com.schmollgruber.algorithms.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
public class AlgorithmProperties {

    private String algorithm;
    private LocalDateTime timeComputation;
    private Long listSize;
    private Long runNanoSeconds;

}
