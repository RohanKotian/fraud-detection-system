package com.mongodb.frauddetector.enums;

public enum Merchant {
    // Groceries
    WHOLE_FOODS(Category.GROCERIES),
    TRADER_JOES(Category.GROCERIES),
    KROGER(Category.GROCERIES),
    WALMART(Category.GROCERIES),

    // Electronics
    APPLE_STORE(Category.ELECTRONICS),
    BEST_BUY(Category.ELECTRONICS),
    AMAZON(Category.ONLINE_SHOPPING),

    // Travel
    DELTA_AIRLINES(Category.TRAVEL),
    UNITED_AIRLINES(Category.TRAVEL),
    MARRIOTT(Category.TRAVEL),
    AIRBNB(Category.TRAVEL),
    UBER(Category.TRAVEL),

    // Dining
    MCDONALDS(Category.DINING),
    STARBUCKS(Category.DINING),
    CHIPOTLE(Category.DINING),
    DOORDASH(Category.DINING),

    // Entertainment
    NETFLIX(Category.ENTERTAINMENT),
    SPOTIFY(Category.ENTERTAINMENT),
    AMC_THEATRES(Category.ENTERTAINMENT),

    // Healthcare
    CVS_PHARMACY(Category.HEALTHCARE),
    WALGREENS(Category.HEALTHCARE),

    // Clothing
    ZARA(Category.CLOTHING),
    NIKE(Category.CLOTHING),

    // Fuel
    SHELL(Category.FUEL),
    EXXON(Category.FUEL),

    // Luxury
    LOUIS_VUITTON(Category.LUXURY),
    ROLEX(Category.LUXURY),
    GUCCI(Category.LUXURY),

    // ATM
    ATM_GENERIC(Category.ATM_WITHDRAWAL),

    // Gaming
    STEAM(Category.GAMING),
    PLAYSTATION_STORE(Category.GAMING);

    private final Category primaryCategory;

    Merchant(Category primaryCategory) {
        this.primaryCategory = primaryCategory;
    }

    public Category getPrimaryCategory() {
        return primaryCategory;
    }
}
