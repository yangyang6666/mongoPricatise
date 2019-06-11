package com.example.service.impl;

import com.example.entity.MongoEntity;
import com.example.repository.MongoRepository;
import com.example.service.MongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * @program: demo
 * @description:
 * @author: yy
 * @create: 2019-06-11 15:19
 **/
@Service
public class MongoServiceImpl implements MongoService {

    @Resource
    private MongoRepository repository;

    public MongoEntity findByTitle(String title) {
        return repository.findByTitle(title);
    }

    @Override
    public <S extends MongoEntity> S save(S s) {
        return repository.save(s);
    }

    @Override
    public <S extends MongoEntity> List<S> saveAll(Iterable<S> iterable) {
        return repository.saveAll(iterable);
    }

    @Override
    public Optional<MongoEntity> findById(String s) {
        return repository.findById(s);
    }

    @Override
    public boolean existsById(String s) {
        return repository.existsById(s);
    }

    @Override
    public List<MongoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public Iterable<MongoEntity> findAllById(Iterable<String> iterable) {
        return repository.findAllById(iterable);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    public void deleteById(String s) {
        repository.deleteById(s);
    }

    @Override
    public void delete(MongoEntity mongoEntity) {
        repository.delete(mongoEntity);
    }

    @Override
    public void deleteAll(Iterable<? extends MongoEntity> iterable) {
        repository.deleteAll(iterable);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    public List<MongoEntity> findAll(Sort sort) {
        return repository.findAll(sort);
    }

    @Override
    public Page<MongoEntity> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public <S extends MongoEntity> S insert(S s) {
        return repository.insert(s);
    }

    @Override
    public <S extends MongoEntity> List<S> insert(Iterable<S> iterable) {
        return repository.insert(iterable);
    }

    @Override
    public <S extends MongoEntity> Optional<S> findOne(Example<S> example) {
        return repository.findOne(example);
    }

    @Override
    public <S extends MongoEntity> List<S> findAll(Example<S> example) {
        return repository.findAll(example);
    }

    @Override
    public <S extends MongoEntity> List<S> findAll(Example<S> example, Sort sort) {
        return repository.findAll(example,sort);
    }

    @Override
    public <S extends MongoEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return repository.findAll(example,pageable);
    }

    @Override
    public <S extends MongoEntity> long count(Example<S> example) {
        return repository.count(example);
    }

    @Override
    public <S extends MongoEntity> boolean exists(Example<S> example) {
        return repository.exists(example);
    }
}
