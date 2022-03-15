package com.threedlottery;

public enum LotteryType {
    SINGLE("single"), GROUP("group"), ONED("oned"),
    GUESS1D("guess1D"), GENERAL("general"),
    SUM("sum"), PACKAGE("package"), TRACTOR("tractor");


    private final String description;

    private LotteryType(String des) {
        description = des;
    }

    @Override
    public String toString() {
        return description;
    }
}
