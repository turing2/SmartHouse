package com.daxia.smarthouse;

import java.util.List;

import org.apache.log4j.Logger;

import com.daxia.smarthouse.plugin.Plugin;
import com.daxia.smarthouse.plugin.PluginLoader;

public class SmartHouse {
	private static Logger logger = Logger.getLogger(SmartHouse.class);
	
	public static void main(String[] args) {
		securityCheck(args);
		
		List<Plugin> plugins = PluginLoader.getInstance().scanAndLoad();
		if (logger.isDebugEnabled()) {
	        logger.debug("Loaded plugins: " + plugins);
		}
    }

	private static void securityCheck(String[] args) {
		
    }
}
