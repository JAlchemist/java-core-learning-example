package com.jaichemist.learning.lambda;

/**
 * @author ethan
 * @date 2019/11/17
 */
public class LambdaTest {
    public static void main(String[] args) {
        LambdaTest lambdaTest = new LambdaTest();

        MathOperation addition = (int a, int b) -> a + b;

        System.out.println("10 + 5 ="+lambdaTest.operate(10,5,addition));

    }

    interface MathOperation{
        int operation(int a,int b);
    }

    private int operate(int a,int b,MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
