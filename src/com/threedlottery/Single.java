package com.threedlottery;

import java.util.Arrays;

public class Single extends Lottery3D{
    public Single(String winNumber) {
        super(winNumber);
    }
    public Single(String winNumber, String userInput){
        super(winNumber, userInput);
    }

    @Override
    public int getWins() {
        if(Arrays.equals(winNumber, getUserNumber())){
            return 1040;
        }else {
            return 0;
        }
    }


}
