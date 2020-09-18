package com.it;

public class SpringMain {

    public static void main(String[] args) {
        //启动
       try {
           new StartTomcat().run();
       }catch (Exception e) {
           e.printStackTrace();
       }
    }
}
