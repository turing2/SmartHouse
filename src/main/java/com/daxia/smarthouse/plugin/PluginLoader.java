package com.daxia.smarthouse.plugin;

import java.util.List;

import com.daxia.smarthouse.plugin.ec.TV;
import com.google.common.collect.Lists;

/**
 * This is a plugin loader which will scan and load any plugins it found.
 */
public class PluginLoader {
	private static PluginLoader instance;

    private PluginLoader() {
    }

    public static PluginLoader getInstance() {
	    if (instance == null) {
		    synchronized (PluginLoader.class) {
			    if (instance == null) {
				    instance = new PluginLoader();
			    }
		    }
	    }
	    return instance;
    }

	public List<IPlugin> scanAndLoad() {
		// TODO 
		/*
		 * 1, scan config file or db
		 * 2, verify all plugins
		 * 3, loader plugin by order
		 * 4, return all loaded plugin
		 */
	    List<IPlugin> plugins = Lists.newArrayList();
	    plugins.add(new TV());
		return plugins;
	}
	
}
