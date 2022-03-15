package com.threedlottery;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Group extends Lottery3D {

    Group(String winNumber) {
        super(winNumber);
    }

    Group(String winNumber, String userInput) {
        super(winNumber, userInput);
    }

    @Override
    public int getWins() {
        Integer[] w = winNumber.clone();
        Integer[] u = getUserNumber().clone();
        Arrays.sort(w);
        Arrays.sort(u);
        if(Arrays.equals(w, u)){
            if (w[0] == w[1] || w[1] == w[2]) {
                return 346;
            }else {
                return 173;
            }
        }else {
            return 0;
        }
    }
}
