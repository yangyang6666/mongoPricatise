package com.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @program: demo
 * @description:
 * @author: yy
 * @create: 2019-06-11 14:55
 **/
//指定集合
@Document(collection = "col")
public class MongoEntity {
    @Id
    public String id;
    public String title;
    public String by;
}
