package com.example.demo.vo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @description: 用户返回值
 * @author: WangWei
 * @create: 2019-10-24 15:00
 */
@Data
@ConfigurationProperties(prefix = "pp")
public class UserVo {

    /**
     * id
     */
    private Long id;

    /**
     * 姓名
     */
    private String name;

    private List<UserVo> list;

}
