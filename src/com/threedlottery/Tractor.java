package com.threedlottery;

public class Tractor extends Lottery3D {
    Tractor(String winNumber) {
        super(winNumber);
    }
    Tractor(String winNumber, String userInput) {
        super(winNumber, userInput);
    }
    @Override
    public int getWins() {
        if ((winNumber[0] == winNumber[1] + 1) && (winNumber[1] == winNumber[2] + 1)){
            return 65;
        }
        if((winNumber[0] == winNumber[1] - 1) && (winNumber[1] == winNumber[2] - 1)){
            return 65;
        }
        return 0;

    }
}
