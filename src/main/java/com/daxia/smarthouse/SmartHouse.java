package com.daxia.smarthouse;

import java.util.List;

import org.apache.log4j.Logger;

import com.daxia.smarthouse.plugin.IPlugin;
import com.daxia.smarthouse.plugin.PluginLoader;

public class SmartHouse {
	private static Logger logger = Logger.getLogger(SmartHouse.class);
	
	public static void main(String[] args) {
		securityCheck(args);
		
		List<IPlugin> plugins = PluginLoader.getInstance().scanAndLoad();
		if (logger.isDebugEnabled()) {
	        logger.debug("Loaded plugins: " + plugins);
		}
		for (IPlugin plugin : plugins) {
            plugin.turnOn();
        }
		for (IPlugin plugin : plugins) {
            plugin.turnOff();
        }
    }

	private static void securityCheck(String[] args) {
	    
    }
}
