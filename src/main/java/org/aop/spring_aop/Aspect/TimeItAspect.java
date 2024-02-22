package org.aop.spring_aop.Aspect;

import org.aop.spring_aop.TimeIt.TimeIt;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeItAspect {
    @After("@annotation(timeIt)")
    public void logExecutionTime(JoinPoint joinPoint, TimeIt timeIt) {
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;
        System.out.println("Method '" + joinPoint.getSignature().getName() + "' took " + executionTime + " nanoseconds to execute.");
    }
}
