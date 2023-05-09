package org.example.singleton;

public class NormalClass {

    private static NormalClass normal=null;

    public String s;

    private NormalClass(){
        s = "Hello ExampleSingleTon";
    }

    public static synchronized NormalClass getInstance(){

        normal=new NormalClass();
        return normal;
    }
}
