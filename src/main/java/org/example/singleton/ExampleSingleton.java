package org.example.singleton;

public class ExampleSingleton {

    private static ExampleSingleton singleton=null;

    public String s;

    private ExampleSingleton(){
        s = "Hello ExampleSingleTon";
    }

    public static synchronized ExampleSingleton getInstance(){
        if (singleton==null){
            singleton=new ExampleSingleton();
        }
        return singleton;
    }
}
