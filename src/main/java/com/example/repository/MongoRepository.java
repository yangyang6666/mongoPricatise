package com.example.repository;

import com.example.entity.MongoEntity;
import org.springframework.stereotype.Repository;


public interface MongoRepository extends org.springframework.data.mongodb.repository.MongoRepository<MongoEntity,String> {
    public MongoEntity findByTitle(String title);
}
