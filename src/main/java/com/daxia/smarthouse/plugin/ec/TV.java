package com.daxia.smarthouse.plugin.ec;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.daxia.smarthouse.plugin.AbstractPlugin;

public class TV extends AbstractPlugin {
    
    private String name = "LeTV 3.0";
    
    @Override
    public String getId() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void turnOn() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String log = name + " was turned on at " + dateFormat.format(new Date());
        System.out.println(log);
    }

    @Override
    public void turnOff() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String log = name + " was turned off at " + dateFormat.format(new Date());
        System.out.println(log);
    }

}
