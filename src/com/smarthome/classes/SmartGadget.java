package com.smarthome.classes;

abstract class SmartGadget {
    private String name;
    private String id;
    public SmartGadget(String name , String id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void turnOff() {
        System.out.println(name + " Turning off");
    }
    public void turnOn(){
        System.out.println(name + " Turning on");
    }
}
