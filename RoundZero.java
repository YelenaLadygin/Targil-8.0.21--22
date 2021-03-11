package com.company;

public class RoundZero {
    public static float RoundUp(float a) {
        if (a == 0) {
            return 0;
        } else if (0 < a && a <= 1) {
            return 1;
        } else
            return -1;
    }

    public static float RoundDown(float a) {
        if (a == 1) {
            return 1;
        } else if (0 <= a && a < 1) {
            return 0;
        } else
            return -1;
    }

    public static float Round(float a) {
        if (0 <= a && a < 0.5) {
            return 0;
        } else if (0.5 <= a && a <= 1) {
            return 1;
        } else
            return -1;
    }
}

