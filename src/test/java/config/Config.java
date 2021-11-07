package config;

// I don't want neither deal with external config reader libraries nor implement my own Singleton config class
// which would read configuration from .properties file. Using interface for constants store seems to be fair
// solution for simple test

public interface Config {
    public static final String email = "";
    public static final String password = "";
    public static final String host = "https://coordinator.hazelcast.cloud";
}
