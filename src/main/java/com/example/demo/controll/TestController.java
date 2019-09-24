package com.example.demo.controll;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * description: 描述
 * @author WangWei
 * @date 2019/9/23 15:49 
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/getInfo")
    public Result firstTest(){
        Map<String, Object> map = new HashMap<>(16);
        map.put("name", "姓名");
        map.put("sex", "女");
        map.put("age", 20);
        map.put("flag", "最新");
        map.put("flag1", "最新1");
        map.put("flag2", "最新2");
        map.put("flag3", "最新3");
        map.put("flag4", "最新4");
        return Result.ok(map);
    }

}
