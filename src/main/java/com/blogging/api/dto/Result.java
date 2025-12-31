package com.blogging.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    private String message;
    private Object data;
    public static Result success(Object data)
    {
        return new Result("201 created",data);
    }
    public static Result fail()
    {
        return new Result("400 Bad Request",null);
    }

}
