package com.example.demo.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @description: 用户请求参数类
 * @author: WangWei
 * @create: 2019-10-24 14:56
 */
@Data
public class UserDto implements Serializable {

    /**
     * id
     */
    @NotNull
    private Long id;

    /**
     * 姓名
     */
    private String name;

}
