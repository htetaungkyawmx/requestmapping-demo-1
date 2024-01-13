package com.example.requestmappingdemo1.ds;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ArticleCriteria {
    private String bodyLike;

    public ArticleCriteria(){

    }
}
