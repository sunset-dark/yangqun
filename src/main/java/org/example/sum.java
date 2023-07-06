package org.example;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入操作数1：");
        double num1 = input.nextDouble(); // 获取用户输入的操作数1
        System.out.println("请输入操作数2：");
        double num2 = input.nextDouble(); // 获取用户输入的操作数2
        double d = sum(num1, num2);
        System.out.println(num1 + "+" + num2 + "=" + d);
    }

    /**
     * 创建sum() 方法，返回double 类型的数值
     *
     * @param i 操作数1
     * @param j 操作数2
     * @return 两个操作数之和
     */
    public static double sum(double i, double j) {
        double sum = i + j;
        return sum;
    }
}