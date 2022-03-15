package com.threedlottery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String winNum = "588";
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String mode = sc.next(), inp;
            if (!mode.equals("tractor")) {
                inp = sc.next();
            } else {
                inp = "";
            }
//            System.out.println(mode+" "+inp);
            Lottery3D lottery3D;
            switch (mode) {
                case "single":
                    lottery3D = new Single(winNum, inp);
                    break;
                case "group":
                    lottery3D = new Group(winNum, inp);
                    break;
                case "guess1d":
                    lottery3D = new Guess1d(winNum, inp);
                    break;
                case "oned":
                    lottery3D = new Oned(winNum, inp);
                    break;
                case "package":
                    lottery3D = new Package(winNum, inp);
                    break;
                case "sum":
                    lottery3D = new Sum(winNum, inp);
                    break;
                case "tractor":
                    lottery3D = new Tractor(winNum, inp);
                    break;
                case "general":
                    lottery3D = new General(winNum, inp);
                    break;
                default:
                    lottery3D = null;
            }
            assert lottery3D != null;
            System.out.println(lottery3D.getWins());
        }


    }

}
