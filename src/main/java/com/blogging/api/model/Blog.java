package com.blogging.api.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.Date;
import java.util.List;

// "title": "My First Blog Post",
//         "content": "This is the content of my first blog post.",
//         "category": "Technology",
//         "tags": ["Tech", "Programming"]
@Data
public class Blog {
    private Long id;

    @NotBlank(message = "标题不能为空")
    @Size(min = 1, max = 100, message = "标题长度必须在1-100字符之间")
    private String title;
    @NotBlank(message = "内容不能为空")
    @Size(min = 10, message = "内容至少10个字符")
    private String content;
    @NotBlank(message = "分类不能为空")
    private String category;
    @NotEmpty(message = "标签不能为空")
    private List<String> tags;
    private Date createTime;
    private Date updateTime;

}

