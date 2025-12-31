package com.blogging.api.dao;

import com.blogging.api.model.Blog;
//import org.apache.ibatis.annotations.Mapper;

//@Mapper
public interface BlogDao {
    void insert(Blog blog);
}
