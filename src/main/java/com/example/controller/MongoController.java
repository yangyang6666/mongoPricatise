package com.example.controller;

import com.example.entity.MongoEntity;
import com.example.repository.MongoRepository;
import com.example.service.MongoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: demo
 * @description:
 * @author: yy
 * @create: 2019-06-11 15:27
 **/
@Controller
@RequestMapping("/test")
public class MongoController {
    @Resource
    MongoService mongoService;

    @GetMapping("/get")
    @ResponseBody
    public List<MongoEntity> getOne(){
        return mongoService.findAll();
    }
}
