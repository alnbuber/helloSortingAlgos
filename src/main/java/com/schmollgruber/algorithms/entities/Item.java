package com.schmollgruber.algorithms.entities;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.processing.Generated;

@Document(collection = "itemsColl")
@Data
public class Item {

    @Id
    private String id;

    private String name;

    public Item(String name) {
        this.id = new ObjectId().toString();
        this.name = name;
    }

    public Item() {
        this.id = new ObjectId().toString();
    }
}
