package com.daxia.smarthouse.plugin.ec;

import java.util.Date;

import org.apache.log4j.Logger;

import com.daxia.smarthouse.event.EventBus;
import com.daxia.smarthouse.event.EventType;
import com.daxia.smarthouse.event.TVEvent;
import com.daxia.smarthouse.plugin.AbstractPlugin;

public class TV extends AbstractPlugin {
    private static Logger logger = Logger.getLogger(TV.class);
    
    private String name = "LeTV 3.0";
    
    @Override
    public String getId() {
        return "123456";
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
        TVEvent event = new TVEvent();
        event.setPluginId(getId());
        event.setDateTime(new Date());
        EventBus.getInstance().fireEvent(EventType.TV_On, event);
    }

    @Override
    public void turnOff() {
        if (logger.isDebugEnabled()) {
            logger.debug(getName() + " turned off");
        }
    }

}
