package com.example.calculator;

import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.runner.notification.RunListener;
import sun.plugin.util.ProgressMonitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalcTest {

    @Test
    public void test_양수덧셈(){
         Calc  c = new Calc();
        int result = c.add(5,4);
        System.out.println("result "+result);

        assertEquals("add의함수의 결과는 9이어야 합니다." + 9, result );
    }

    @Test
    public void test_음수테스트(){

        Calc  c = new Calc();
        int result = c.add(-5,-4);
        System.out.println("result "+result);

        assertEquals("add의함수의 결과는 -9이어야 합니다." + -9, result );
    }

    @Test
    public void test_양수덧셈2(){
        Calc  c = new Calc();
        int result = c.add(5,4);
        System.out.println("result "+result);

        assertNotEquals(0, result);
    }

    @Test
    public void test_정수나눗셈(){

        Calc c = new Calc();
        int reslut = c.divide(10,5);
        assertEquals(2, reslut);
    }

    @Test
    public void test_실수나눗셈(){
        Calc c = new Calc();
        double result = c.divide(10.0,4.0);
        assertEquals(2.5,result,0.0f);
    }

    @Test
    public void test_0으로나누기(){//100% ㄷㄱ객

        Calc c = new Calc();
        double reslut = c.divide(10,0);
        assertEquals(0, reslut, 0.0f);

    }



}
