package com.daxia.smarthouse.plugin;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Plugin {
	private String id;
	private String name;
	/**
     * @return the id
     */
    public String getId() {
    	return id;
    }
	/**
     * @param id the id to set
     */
    public void setId(String id) {
    	this.id = id;
    }
	/**
     * @return the name
     */
    public String getName() {
    	return name;
    }
	/**
     * @param name the name to set
     */
    public void setName(String name) {
    	this.name = name;
    }

    @Override
    public String toString() {
    	return ToStringBuilder.reflectionToString(this);
    }
}
