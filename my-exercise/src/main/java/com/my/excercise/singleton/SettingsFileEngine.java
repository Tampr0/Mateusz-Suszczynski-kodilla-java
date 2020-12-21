package com.my.excercise.singleton;

public class SettingsFileEngine {
    private static SettingsFileEngine settingsFileEngineInstance = null;
    private String fileName = "";

    private SettingsFileEngine() {
    }
    public static SettingsFileEngine getInstance() {
        if (settingsFileEngineInstance == null) {
            synchronized (SettingsFileEngine.class) {
                if (settingsFileEngineInstance == null) {
                    settingsFileEngineInstance = new SettingsFileEngine();
                }
            }
        }
        return settingsFileEngineInstance;
    }

    public String getFilenName() {
        return fileName;
    }
    public void open(final String filenName) {
        this.fileName = filenName;
        System.out.println("Opening the setting file");
    }
    public void close() {
        this.fileName = "";
        System.out.println("Closing the setting file");
    }
    public boolean loadSetting() {
        System.out.println("Loading settings from file");
        return true;
    }
    public boolean saveSetting() {
        System.out.println("Saving setting from file");
        return true;

    }

}
