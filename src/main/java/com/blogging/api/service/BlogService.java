
package com.blogging.api.service;

import com.blogging.api.dto.Result;
import com.blogging.api.model.Blog;

import org.springframework.stereotype.Service;

@Service
public interface BlogService {
    Result createBlog(Blog blog);
}
