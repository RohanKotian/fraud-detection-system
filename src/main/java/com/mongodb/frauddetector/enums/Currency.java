package com.mongodb.frauddetector.enums;

public enum Currency {
    USD("US Dollar", "United States"),
    EUR("Euro", "Eurozone"),
    GBP("British Pound", "United Kingdom"),
    JPY("Japanese Yen", "Japan"),
    CAD("Canadian Dollar", "Canada"),
    AUD("Australian Dollar", "Australia"),
    CHF("Swiss Franc", "Switzerland"),
    CNY("Chinese Yuan", "China"),
    INR("Indian Rupee", "India"),
    BRL("Brazilian Real", "Brazil");

    private final String displayName;
    private final String region;

    Currency(String displayName, String region) {
        this.displayName = displayName;
        this.region = region;
    }

    public String getDisplayName() {
        return displayName;
    }
    public String getRegion(){
        return region;
    }
}
