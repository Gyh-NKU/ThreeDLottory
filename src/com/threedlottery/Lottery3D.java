package com.threedlottery;
abstract public class Lottery3D {
    protected Integer[] winNumber;
    protected Integer[] userNumber;
    public String userInput;

    Lottery3D(String winNumber) {
        this.winNumber = StringtoIntArray(winNumber);
    }

    Lottery3D(String winNumber, String userInput) {
        this(winNumber);
        this.userInput = userInput;
        setUserNumber(userInput);
    }

    public void setUserNumber(String userInput) {
        userNumber = StringtoIntArray(userInput);
    }

    public Integer[] getUserNumber() {
        return this.userNumber;
    }

    public abstract int getWins();

    Integer[] StringtoIntArray(String s) {
        Integer[] res = new Integer[s.length()];
        for (int i = 0; i < s.length(); i++) {
            res[i] = Integer.parseInt(s.charAt(i) + "");
        }
        return res;
    }

    boolean isAvailable(String s) {
        return false;
    }

}