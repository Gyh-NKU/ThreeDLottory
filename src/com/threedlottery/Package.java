package com.threedlottery;

import java.util.Arrays;

public class Package extends Lottery3D {
    Package(String winNumber) {
        super(winNumber);
    }
    Package(String winNumber, String userInput) {
        super(winNumber, userInput);
    }
    @Override
    public int getWins() {
        Integer[] u = userNumber.clone();
        Integer[] w = winNumber.clone();
        Arrays.sort(u);
        Arrays.sort(w);
        if (Arrays.equals(userNumber, winNumber)) {
            if (u[0].equals(u[1]) && u[1].equals(u[2])) {
                return 693;
            } else {
                return 606;
            }
        }
        if (Arrays.equals(u, w)) {
            if (u[0].equals(u[1]) && u[1].equals(u[2])) {
                return 173;
            } else {
                return 86;
            }
        }
        return 0;
    }
}
