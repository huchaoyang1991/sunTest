package com.sun.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by huchaoyang on 2019/5/11.
 */
public class TestRun2 {
    @Test
    public void start1(){
        assert false;
    }
    @Test
    public void start2(){
        Reporter.log("");
        throw new RuntimeException("哒哒");
    }
}
