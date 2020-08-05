package com.schmollgruber.algorithms.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Document(collection = "benchmarkAlgorithms")
@Data
public class BenchmarkItem {

    @Id
    private String id;

    private AlgorithmProperties algorithmProperties;
}
