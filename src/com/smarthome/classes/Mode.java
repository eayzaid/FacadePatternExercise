package com.smarthome.classes;

import java.util.ArrayList;

abstract class Mode {
    private ArrayList<SmartGadget> envolvedGadgets =  new ArrayList<>();
    public void AddGadget(SmartGadget gadget)
    {
        envolvedGadgets.add(gadget);
    }
    public void deleteGadget(SmartGadget gadget)
    {
        envolvedGadgets.remove(gadget);
    }
    public SmartGadget GetGadget(String name)
    {
        return envolvedGadgets.stream().filter(gadget -> gadget.getName().equals(name)).findFirst().orElse(null);
    }
    public abstract void executeMode();
}
