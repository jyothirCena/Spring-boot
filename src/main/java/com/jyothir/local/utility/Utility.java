package com.jyothir.local.utility;

import java.util.Random;

public class Utility {

    public static int nDigitRandomNo(int digits) {

        Random random = new Random();
        int min = (int) Math.pow(10,digits-1);
        int max = (int) Math.pow(10,digits) - 1;
        return random.nextInt(max - min + 1) + min;
    }
}
