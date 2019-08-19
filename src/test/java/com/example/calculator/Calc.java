package com.example.calculator;

public class Calc {
    public int add(int a, int b){
        return a+b;
    }

    public int divide(int a, int b){
//        if(b==0){
//            throw new ArithmeticException();
//        }else{
//
//            return a/b;
//        }

        try{
            return a/b;
        }catch (ArithmeticException ex){
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
    }

    public double divide(double a, double b){
        return a/b;
    }

    public int substract(int a, int b){
        return a-b;
    }

}
