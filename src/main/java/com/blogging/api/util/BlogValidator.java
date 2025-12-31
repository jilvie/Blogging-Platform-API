package com.blogging.api.util;

import lombok.extern.slf4j.Slf4j;
import com.blogging.api.model.Blog;
import java.util.List;

@Slf4j
public class BlogValidator {
    
    public static boolean isValid(Blog blog) {
        if (blog == null) {
            log.info("error,blog is nulll");
            return false;
        }
        
        // 检查必需字段是否为空
        if (blog.getTitle() == null || blog.getTitle().trim().isEmpty()) {
            log.info("error,blog title is nulll");
            return false;
        }
        
        if (blog.getContent() == null || blog.getContent().trim().isEmpty()) {
            log.info("error,blog content is nulll");
            return false;
        }
        
        if (blog.getCategory() == null || blog.getCategory().trim().isEmpty()) {
            log.info("error,blog category is nulll");
            return false;
        }
        
        // 检查tags列表是否为null
        if (blog.getTags() == null|| blog.getTags().isEmpty()) {
            log.info("error,blog tags is nulll");
            return false;
        }

        return true;
    }
}