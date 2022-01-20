package com.company;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("результат вычисления для x=3.18" );
        System.out.println(func(3.18));
        System.out.println("результат вычисления для x=-4.6" );
        System.out.println(func(-4.6));
        System.out.println("результат вычисления для x=1.12" );
        System.out.println(func(1.12));
    }
    public static double func(double x)
    {
        double y;
        double a=6.27, b=5.13;
        if(x>=2) {
            y = Math.sqrt (Math.pow(x,3)+ Math.cos(x));
        }
        else if (x<0) {
            y = Math.pow (Math.sin (b*x), 3);
        }
        else {
            y = Math.log(Math.pow(x,2)+b);
        }
        return y;
    }
}
