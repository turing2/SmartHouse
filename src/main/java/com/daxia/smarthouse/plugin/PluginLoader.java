package com.daxia.smarthouse.plugin;

import java.util.List;

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

	public List<Plugin> scanAndLoad() {
		// TODO 
		/*
		 * 1, scan config file or db
		 * 2, verify all plugins
		 * 3, loader plugin by order
		 * 4, return all loaded plugin
		 */
		return null;
	}
	
}
