package com.cm.lee.classmanager.classsystem;

import android.util.Log;

/**
 * Created by lee on 30/12/2016.
 */
public class CSystem {

    private static final String TAG = "CSystem";

    public final Block[] dayArray;
    public int index;

    public int timeTillNext;
    public String currentBlock;

    public CSystem(Block[] dayArray) {
        this.dayArray = dayArray;
    }

    /*public void GetNumOfPer() {
        index = 0;
        for (int x = 0; x >= dayArray.length; x++) {
            if (dayArray[x].name != "break") {
                index++;
            }
        }
    }*/

    public void checkCurrent(int currentT) {
        int t = 8 * 60;
        Log.i(TAG, "checking time, " + currentT + " , " + t);
        Log.i(TAG, dayArray.length + "");
        for (int x = 0; x <= dayArray.length; x++) {
            t = t + dayArray[x].length;
            Log.i(TAG, "checking time, " + t + ", " + x);
            if (currentT < t) {
                timeTillNext = t - currentT;
                currentBlock = dayArray[x].name;
                break;
            }
        }
    }
}
