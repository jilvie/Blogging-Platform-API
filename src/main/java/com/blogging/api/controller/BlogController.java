
package com.blogging.api.controller;

import com.blogging.api.dto.Result;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import com.blogging.api.model.Blog;

import org.springframework.web.bind.annotation.*;
import com.blogging.api.service.BlogService;
//标识其为请求处理类
@RestController
@RequestMapping("/posts")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @PostMapping//处理POST请求
    public Result createBlog(@Valid @RequestBody Blog blog) {

        return blogService.createBlog(blog);
    }

}
