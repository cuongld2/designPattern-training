package org.example.builderPattern;

public class Main {
    public static void main(String[] args) {
        Computer c = new Computer
                .ComputerBuilder("1TB","8GB")
                .Builder();

        System.out.println(c.toString());

    }
}