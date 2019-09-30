package com.example.demo.controller;

import com.example.demo.annotation.Log;
import com.example.demo.enums.OperationType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 描述
 * @author WangWei
 * @date 2019/9/23 15:49 
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {

    @Log( detail = "获取学生[{{name}}]数据", leave = 1, operationType = OperationType.SELECT)
    @RequestMapping("/getInfo")
    public Result firstTest(String name){
        Map<String, Object> map = new HashMap<>(16);
        map.put("name", "姓名==" + name);
        map.put("sex", "女");
        map.put("age", 20);
        map.put("flag", "最新");
        map.put("flag1", "最新1");
        map.put("flag2", "最新2");
        map.put("flag3", "最新3");
        map.put("flag4", "最新4");
        map.put("flag5", "最新5");
        return Result.ok(map);
    }

}
