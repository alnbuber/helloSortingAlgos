package com.schmollgruber.algorithms.repositories;

import com.schmollgruber.algorithms.entities.BenchmarkItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BenchmarkRepository extends MongoRepository<BenchmarkItem, String> {
}
