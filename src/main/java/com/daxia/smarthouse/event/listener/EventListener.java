package com.daxia.smarthouse.event.listener;

import java.util.Set;

import com.daxia.smarthouse.event.Event;
import com.daxia.smarthouse.event.EventType;

public interface EventListener {
    
    public Set<EventType> acceptableEvents();
    
    public void onEvent(Event event);
}
