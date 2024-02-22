package org.aop.spring_aop.Service;

import org.aop.spring_aop.TimeIt.TimeIt;
import org.springframework.stereotype.Component;

@Component
public class test {
    @TimeIt
    public void timeIt() throws InterruptedException{
        System.out.println("mon premier test");
    }
}