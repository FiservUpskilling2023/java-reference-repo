package com.xpanxion.java.intro.enums;

public enum Transport { // Enums can be like very simple classes.

    //
    // Data members
    //

    PLANE (600), TRAIN (80), AUTOMOBILE (50);

    public int speed;

    //
    // Constructor
    //

    Transport(int s) {
        speed = s;
    }
}
