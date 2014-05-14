package com.daxia.smarthouse.event;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Event {
    private String pluginId;
    private Date dateTime;
    /**
     * @return the pluginId
     */
    public String getPluginId() {
        return pluginId;
    }
    /**
     * @param pluginId the pluginId to set
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId;
    }
    /**
     * @return the dateTime
     */
    public Date getDateTime() {
        return dateTime;
    }
    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
