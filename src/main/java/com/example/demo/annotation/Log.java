package com.example.demo.annotation;

import com.example.demo.enums.OperationType;

import java.lang.annotation.*;

/**
 * description: 描述
 * @author WangWei
 * @date 2019/9/25 17:17 
 */
@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Log {
    /**
     * 方法描述
     */
    String detail() default "";

    /**
     * 日志等级 1-3 级
     */
    int leave() default 0;

    /**
     * 操作类型(enum):主要是select,insert,update,delete
     */
    OperationType operationType() default OperationType.UNKNOWN;

}
