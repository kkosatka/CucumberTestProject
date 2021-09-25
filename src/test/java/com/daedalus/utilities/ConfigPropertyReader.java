package com.daedalus.utilities;



import java.util.Properties;

/**
 * This is the utility class for data read write
 *
 * @author QAIT
 *
 */
public class ConfigPropertyReader {

    private static String defaultConfigFile = "./config.properties";
    
    /**
     * constructor of this class
     */
    public ConfigPropertyReader() {
    }

    /**
     *
     * This method will get the properties pulled from a file located relative to the base dir
     *
     * @param propFile complete or relative (to base dir) file location of the properties file
     * @param Property property name for which value has to be fetched
     * @return String value of the property
     */
    public static String getProperty(String propFile, String Property) {
        try {
            Properties prop = ResourceLoader.loadProperties(propFile);
            return System.getProperty(Property, prop.getProperty(Property));
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public static String getProperty(String property){
        return getProperty(defaultConfigFile, property);
    }
}
