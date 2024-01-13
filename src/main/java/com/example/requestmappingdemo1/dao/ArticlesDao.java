package com.example.requestmappingdemo1.dao;

import com.example.requestmappingdemo1.ds.Article;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticlesDao extends CrudRepository<Article,Integer> {
    List<Article> findByBodyLikeIgnoreCase(String content);
}
