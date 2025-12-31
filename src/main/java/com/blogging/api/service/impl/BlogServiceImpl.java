package com.blogging.api.service.impl;


import com.blogging.api.dao.BlogDao;
import com.blogging.api.dto.Result;
import jakarta.annotation.Resource;
import com.blogging.api.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blogging.api.service.BlogService;

@Service
public class BlogServiceImpl implements BlogService {


    // @Resource
   // private BlogDao blogDao;
    @Override
    public Result createBlog(Blog blog) {
        System.out.println(blog);

      //  blogDao.insert(blog);

        return Result.success(blog);
    }
}