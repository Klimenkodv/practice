package ru.october.config;

public final class TestConfig {

    private TestConfig() {
    }

    public static final String BASE_URL = System.getProperty("base_url", "http://2.59.41.2:7320");

}
