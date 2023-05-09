package org.example.abstractFactoryClass;

public class TestAbstractFactoryClass {

    public static void main(String[] args){


        testAbstractFactory();
    }

    private static void testAbstractFactory(){

        Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB","500 GB", "2.4 GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("15 GB", "200 GB", "4.8 GHz"));
        System.out.println("AbstractFactory PC Config::"+pc);
        System.out.println("AbstractFactory Server Config:"+server);
    }
}
