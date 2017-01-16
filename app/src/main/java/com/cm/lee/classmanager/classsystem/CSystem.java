package com.cm.lee.classmanager.classsystem;

import android.util.Log;

/**
 * Created by lee on 30/12/2016.
 */
public class CSystem {

    private static final String TAG = "CSystem";

    public final CSDay[] week;


    public int timeTillNext;
    public String currentBlock;

    public CSystem(CSDay[] week) {
        this.week = week;
    }

    public void checkCurrent(int currentT, int currentD) {
        int t = 8 * 60;
        Log.i(TAG, "checking time, " + currentT + " , " + t);
        Log.i(TAG, week[currentD].b.length + "");
        for (int x = 0; x <= week[currentD].b.length; x++) {
            t = t + week[currentD].b[x].length;
            Log.i(TAG, "checking time, " + t + ", " + x);
            if (currentT < t) {
                timeTillNext = t - currentT;
                currentBlock = week[currentD].b[x].name;
                break;
            }
        }
    }
}
