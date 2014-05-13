package com.daxia.smarthouse.plugin;


public interface IPlugin {
    
    public String getId();
    public String getName();
    
    public void turnOn();
    
    public void turnOff();
}
