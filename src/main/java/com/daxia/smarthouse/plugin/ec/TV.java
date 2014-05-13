package com.daxia.smarthouse.plugin.ec;

import org.apache.log4j.Logger;

import com.daxia.smarthouse.plugin.AbstractPlugin;

public class TV extends AbstractPlugin {
    private static Logger logger = Logger.getLogger(TV.class);
    
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
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + " turned on");
        }
    }

    @Override
    public void turnOff() {
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + " turned off");
        }
    }

}
