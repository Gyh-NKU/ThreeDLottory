package com.threedlottery;

import java.util.Objects;

public class Oned extends Lottery3D{
    Oned(String winNumber) {
        super(winNumber);
    }
    Oned(String winNumber, String userInput) {
        super(winNumber, userInput);
    }
    @Override
    public int getWins() {
        for (int i = 0; i < 3; i++) {
            if (Objects.equals(userNumber[i], winNumber[i])) {
                return 10;
            }
        }
        return 0;
    }

    @Override
    public void setUserNumber(String userInput) {
        userNumber = new Integer[3];
        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) <= '9' && userInput.charAt(i) >= '0') {
                userNumber[i] = Integer.parseInt(userInput.charAt(i) + "");
            } else {
                userNumber[i] = 10;
            }
        }
    }
}
