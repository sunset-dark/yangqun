package org.example;

class XiyoujiRenwu {
    float height,weight;
    String head;
    void speak (String s) {
        head = "歪头";
        System.out.println(s);
    }
}
public class xiyou{
    public static void main(String[] args) {
        XiyoujiRenwu zhubajie,sunwukong; //声明对象
        zhubajie = new XiyoujiRenwu(); //为对象分配变量
        sunwukong = new XiyoujiRenwu();
        zhubajie.height = 1.80f; //对象给自己的变量赋值
        zhubajie.head = "大头";
        sunwukong.height = 1.60f; //对象给自己的变量赋值
        sunwukong.weight = 1000f;
        sunwukong.head = "长发飘飘";
        System.out.println("zhubajie的身高:"+zhubajie.height);
        System.out.println("zhubajie的头:"+zhubajie.head);
        System.out.println("sunwukong的重量:"+sunwukong.weight);
        System.out.println("sunwukong的头:"+sunwukong.head);
        zhubajie.speak("俺老猪想娶媳妇"); //对象调用方法
        System.out.println("zhubajie现在的头:"+zhubajie.head);
        sunwukong.speak("俺老孙想骗八戒背我"); //对象调用方法
        System.out.println("sunwukong现在的头:"+sunwukong.head);
    }
}