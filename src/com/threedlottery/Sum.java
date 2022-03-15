package com.threedlottery;

public class Sum extends Lottery3D {
    Sum(String winNumber) {
        super(winNumber);
    }
    Sum(String winNumber, String userInput) {
        super(winNumber, userInput);
    }
    @Override
    public int getWins() {
        int ans = 0;
        int sumWinNum = 0;
        for (int i = 0; i < 3; i++) {
            sumWinNum += winNumber[i];
        }
        if (sumWinNum == userNumber[0]) {
            switch (sumWinNum) {
                case 0:
                case 27:
                    ans = 1040;
                    break;
                case 1:
                case 26:
                    ans = (345);
                    break;
                case 2:
                case 25:
                    ans = (172);
                    break;
                case 3:
                case 24:
                    ans = (104);
                    break;
                case 4:
                case 23:
                    ans = (69);
                    break;
                case 5:
                case 22:
                    ans = (49);
                    break;
                case 6:
                case 21:
                    ans = (37);
                    break;
                case 7:
                case 20:
                    ans = (29);
                    break;
                case 8:
                case 19:
                    ans = (23);
                    break;
                case 9:
                case 18:
                    ans = (19);
                    break;
                case 10:
                case 17:
                    ans = (16);
                    break;
                case 11:
                case 16:
                case 12:
                case 15:
                    ans = (15);
                    break;
                case 13:
                case 14:
                    ans = (14);
                    break;
            }
        }
        //在此实现彩票金额返回
        return ans;
    }

    @Override
    public void setUserNumber(String userInput) {
        userNumber = new Integer[1];
        userNumber[0] = Integer.parseInt(userInput);
    }
}
