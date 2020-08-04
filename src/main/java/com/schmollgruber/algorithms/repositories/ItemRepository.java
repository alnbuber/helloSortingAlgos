package com.schmollgruber.algorithms.repositories;

import com.schmollgruber.algorithms.entities.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ItemRepository extends MongoRepository<Item, String> {

}
