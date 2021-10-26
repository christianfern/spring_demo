package com.example.demo.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Slf4j
@Aspect
@Component
public class LoggingAspect {

    /**
     * Advice that logs before a method is entered
     *
     * @param joinPoint join point for advice
     */
    @Before("execution(* com.example.demo.service..*(..))")
    public void logBefore(JoinPoint joinPoint) {
        log.debug("Calling {}.{}() ...",
                joinPoint.getTarget().getClass().getSimpleName(),
                joinPoint.getSignature().getName(),
                Arrays.toString(joinPoint.getArgs()));
    }

}
