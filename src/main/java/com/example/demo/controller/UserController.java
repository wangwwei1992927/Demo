package com.example.demo.controller;

import com.example.demo.annotation.Log;
import com.example.demo.dto.UserDto;
import com.example.demo.enums.OperationType;
import com.example.demo.vo.StudentVo;
import com.example.demo.vo.UserVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * 用户类
 *
 * @author WangWei
 * @date 2019/9/23 15:49
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    UserVo vo;


    @PostConstruct
    public void show() {
        System.out.println("11111");
        System.out.println("vo:" + vo.toString());
    }

    /**
     * 获取学生信息
     *
     * @param vo 姓名
     * @return
     * @
     */
    @RequestMapping("/getStuInfo")
    public StudentVo getStuInfo(@RequestBody StudentVo vo) {
        vo.setName(vo.getName());
        vo.setHobby("打篮球" + vo.getJia());
        return vo;
    }

    /**
     * 接口描述: 根据id获取用户信息
     *
     * @param dto
     * @return
     */
    @PostMapping("getInfo")
    public UserVo getInfo(@RequestBody UserDto dto) {
        UserVo vo = new UserVo();
        vo.setId(dto.getId());
        vo.setName("娃娃");
        return vo;
    }

}
