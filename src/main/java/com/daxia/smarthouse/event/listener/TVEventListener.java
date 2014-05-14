package com.daxia.smarthouse.event.listener;

import java.util.Set;

import org.apache.log4j.Logger;

import com.daxia.smarthouse.event.Event;
import com.daxia.smarthouse.event.EventType;
import com.google.common.collect.Sets;

public class TVEventListener implements EventListener {
    private static Logger logger = Logger.getLogger(TVEventListener.class);
    
    @Override
    public void onEvent(Event event) {
        if (logger.isDebugEnabled()) {
            logger.debug("onEvent, event: " + event);
        }
    }

    @Override
    public Set<EventType> acceptableEvents() {
        Set<EventType> types = Sets.newHashSet();
        types.add(EventType.TV_On);
        types.add(EventType.TV_Off);
        return types;
    }

}
