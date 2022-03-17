package com.threedlottery;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的投注方式：");
            String mode = sc.next(), inp;
            if (!mode.equals("tractor")) {
                System.out.println("请输入你的投注号码：");
                inp = sc.next();
            } else {
                inp = "";
            }
            String winNum;
            Random rd = new Random();
            Integer[] win = new Integer[3];
            for (int i = 0; i < 3; i++) {
                win[i] = rd.nextInt(10);
            }
            System.out.println("中奖号码为：" + win[0] + " " + win[1] + " " + win[2]);
//            System.out.println(mode+" "+inp);
            winNum = "" + win[0] + win[1] + win[2];
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
            System.out.println("你的中奖金额为：");
            System.out.println(lottery3D.getWins());
        }


    }

}
