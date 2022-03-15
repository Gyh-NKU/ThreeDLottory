package com.threedlottery;

import java.util.Arrays;

public class General extends Lottery3D{
    General(String winNumber) {
        super(winNumber);
    }
    General(String winNumber, String userInput) {
        super(winNumber, userInput);
    }
    @Override
    public int getWins() {
        if (Arrays.equals(winNumber, getUserNumber())) {
            return 470;
        } else {
            int sameNum = 0;
            for (int i = 0; i < 3; i++) {
                if (winNumber[i].equals(getUserNumber()[i])) {
                    sameNum++;
                }
            }
            if (sameNum == 2) {
                return 21;
            } else {
                return 0;
            }
        }
    }
}
