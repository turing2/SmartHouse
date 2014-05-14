package com.daxia.smarthouse.event;

import java.util.ArrayList;
import java.util.List;

import com.daxia.smarthouse.event.listener.EventListener;

public class EventBus {
    private static volatile EventBus instance;

    private List<EventListener> eventListeners = new ArrayList<EventListener>();
    
    private EventBus() {
    }

    public static EventBus getInstance() {
        if (instance == null) {
            synchronized (EventBus.class) {
                if (instance == null) {
                    instance = new EventBus();
                }
            }
        }
        return instance;
    }
    
    public void registerListener(EventListener eventListener) {
        eventListeners.add(eventListener);
    }
    
    public void fireEvent(EventType eventType, Event event) {
        for (EventListener listener : eventListeners) {
            if (listener.acceptableEvents().contains(eventType)) {
                listener.onEvent(event);
            }
        }
    }
}
