package com.example.demo.controller;

import java.util.HashMap;

/**
 * description: 描述
 *
 * @author WangWei
 * @date 2019/9/23 15:51
 */
public class Result extends HashMap<String, Object> {

    private static final long serialVersionUID = -8194821450292902175L;
    private static final Integer SUCCESS = 0;
    private static final Integer FAIL = -1;

    public Result() {
        this("处理成功");
    }

    public Result(String msg) {
        this.put("code", SUCCESS);
        this.put("msg", msg);
    }

    public static Result error(int code, String msg) {
        Result r = new Result();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static Result error() {
        return error(FAIL, "未知异常，请联系管理员");
    }

    public static Result error(String msg) {
        return error(FAIL, msg);
    }

    public static Result ok(String msg) {
        Result r = new Result();
        r.put("msg", msg);
        return r;
    }

    public static Result ok(Object data) {
        Result r = new Result();
        r.put("content", data);
        return r;
    }

    public static Result ok() {
        return new Result();
    }

    @Override
    public Result put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}

