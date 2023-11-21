package org.example.function;

public class DemoFunction {

    public static void getFunction(String[] args) {

    }

    public static int getSum(int i1, int i2) {

        return i1+i2 ;
    }

    public static int getSum(int i1, int i2, int i3) {

        return i1+i2+i3 ;
    }

    public static Integer getSumInt(int i1, int i2) {

        return null ; // possible car Integer
    }

    public static double getSum(double...doubles) {
        double result = 0 ;
        for (double d:doubles) {
            result += d ;
        }
        return result ;
    }


}
