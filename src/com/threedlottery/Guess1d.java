package com.threedlottery;

public class Guess1d extends Lottery3D{
    Guess1d(String winNumber) {
        super(winNumber);
    }
    Guess1d(String winNumber, String userInput) {
        super(winNumber, userInput);
    }
    @Override
    public void setUserNumber(String userInput) {
        userNumber = new Integer[1];
        userNumber[0] = Integer.parseInt(userInput);
    }
    @Override
    public int getWins() {
        int sameNum = 0;
        for (int i = 0; i < 3; i++) {
            if (winNumber[i].equals(userNumber[0])) {
                sameNum++;
            }
        }
        if (sameNum == 1) {
            return 2;
        } else if (sameNum == 2) {
            return 12;
        } else if (sameNum == 3) {
            return 230;
        }
        return 0;
    }
}
