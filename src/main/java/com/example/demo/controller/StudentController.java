package com.example.demo.controller;

import com.example.demo.vo.StudentVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 学生类
 * @author: WangWei
 * @create: 2019-10-24 16:50
 */
@Slf4j
@RestController
@RequestMapping("/student")
public class StudentController {

    /**
     * 获取学生信息
     * @
     * @param name 姓名
     * @return
     */
    @RequestMapping("/getStuInfo")
    public StudentVo getStuInfo(String name){
        StudentVo vo = new StudentVo();
        vo.setName(name);
        vo.setSex(1);
        vo.setHobby("打篮球");
        return vo;
    }
}
