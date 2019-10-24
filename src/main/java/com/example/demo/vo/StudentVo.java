package com.example.demo.vo;

import lombok.Data;

import java.util.List;

/**
 * @description: 学生信息
 * @author: WangWei
 * @create: 2019-10-24 16:11
 */
@Data
public class StudentVo {

    /**
     * id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 爱好
     */
    private String hobby;
    /**
     * 用户列表
     */
    private List<UserVo> userVoList;


}
