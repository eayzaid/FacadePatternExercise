package com.smarthome.classes;

public class SmartLED extends SmartGadget{
    private int intensity;
    private String color;
    public SmartLED(String name , String id ,int intensity, String color){
        super(name , id);
        this.intensity = intensity;
        this.color = color;
    }
    public String setIntensity(int intensity) {
        this.intensity = intensity;
        System.out.println("intensity set to " + intensity);
    }
    public String setColor(String color) {
        this.color = color;
        System.out.println("color set to " + color);
    }
}
