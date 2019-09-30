package com.example.demo.aop;

import com.example.demo.annotation.Log;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * description: 描述
 * @author WangWei
 * @date 2019/9/25 17:29 
 */
@Aspect
@Component
@Slf4j
public class LogAspect {

    @Pointcut("@annotation(com.example.demo.annotation.Log)")
    public void operationLog(){

    }

    /**
     * 环绕中执行
     * @param joinPoint
     */
    @Around("operationLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        log.info("aroud环绕前操作");
        Object ob = joinPoint.proceed();
        log.info("aroud环绕后操作");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Log l = methodSignature.getMethod().getAnnotation(Log.class);
        if(l !=null) {
            log.info("目标接口上的注解的值：{}", l.detail());
        }
        return  ob;
    }

    /**
     * 目标方法执行前
     * @param joinPoint
     */
    @Before("operationLog()")
    public void beforeDo(JoinPoint joinPoint){
        joinPoint.getArgs();
        log.info("before操作");
    }

    /**
     * 执行完之后
     * @param joinPoint
     */
    @After("operationLog()")
    public void afterDo(JoinPoint joinPoint){
        log.info("after的操作,目标方法执行完了");
    }

    /**
     * 执行完之后的返回值
     * @param ret
     */
    @AfterReturning(returning = "ret", pointcut = "operationLog()")
    public void afterDoReturn(Object ret){
        log.info("目标方法执行完 方法返回值：{}", ret);
    }

    /**
     * 后置异常通知
     */
    @AfterThrowing("operationLog()")
    public void throwss(JoinPoint jp){
        System.out.println("方法异常时执行.....");
    }
}
