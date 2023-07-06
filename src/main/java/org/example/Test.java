package org.example;

public class Test {
    public static void main(String[] args) {
        int x = 10;
        while( x < 20 ) {
            System.out.print("value of x : " + x );
            x++;
            System.out.print("\n");
        }
        int y = 30;

        if( y < 20 ){
            System.out.print("这是 if 语句");
        }else{
            System.out.print("这是 else 语句");
        }
    }
}

