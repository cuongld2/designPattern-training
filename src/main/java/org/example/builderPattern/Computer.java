package org.example.builderPattern;

public class Computer {
    private String HDD,RAM;

    //optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private String getHDD() {
        return HDD;
    }
    public String getRAM() {
        return RAM;
    }
    private boolean getisGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean getisBluetoothEnabled() {
        return isBluetoothEnabled;
    }
    public String toString(){
        return "HDD:"+HDD+" RAM:"+RAM+" isBlutooth:"+isBluetoothEnabled;
    }

    Computer(ComputerBuilder builders){
        this.HDD = builders.HDD;
        this.RAM = builders.RAM;
        this.isBluetoothEnabled = builders.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builders.isGraphicsCardEnabled;
    }

    static class ComputerBuilder{
        // required parameters
        private String HDD;
        private String RAM;

        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        ComputerBuilder(String HDD,String RAM){
            this.RAM = RAM;
            this.HDD = HDD;
        }

        ComputerBuilder setGraphicsCardEnabled(Boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        ComputerBuilder setBluetoothEnabled(Boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer Builder(){
            return new Computer(this);
        }

    }
}