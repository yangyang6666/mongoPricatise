package com.example.service;

import com.example.entity.MongoEntity;
import com.example.repository.MongoRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface MongoService  {

    <S extends MongoEntity> S save(S s);

    <S extends MongoEntity> List<S> saveAll(Iterable<S> iterable);

    Optional<MongoEntity> findById(String s);

    boolean existsById(String s);

    List<MongoEntity> findAll();

    Iterable<MongoEntity> findAllById(Iterable<String> iterable);

    long count();

    void deleteById(String s);

    void delete(MongoEntity mongoEntity);

    void deleteAll(Iterable<? extends MongoEntity> iterable);

    void deleteAll();

    List<MongoEntity> findAll(Sort sort);

    Page<MongoEntity> findAll(Pageable pageable);

    <S extends MongoEntity> S insert(S s);

    <S extends MongoEntity> List<S> insert(Iterable<S> iterable);

    <S extends MongoEntity> Optional<S> findOne(Example<S> example);

    <S extends MongoEntity> List<S> findAll(Example<S> example);

    <S extends MongoEntity> List<S> findAll(Example<S> example, Sort sort);

    <S extends MongoEntity> Page<S> findAll(Example<S> example, Pageable pageable);

    <S extends MongoEntity> long count(Example<S> example);

    <S extends MongoEntity> boolean exists(Example<S> example);
}
