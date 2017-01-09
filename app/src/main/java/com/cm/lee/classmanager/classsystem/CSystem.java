package com.cm.lee.classmanager.classsystem;

import android.util.Log;

/**
 * Created by lee on 30/12/2016.
 */
public class CSystem {

    private static final String TAG = "CSystem";

    public final Block[] dayArray;
    public final Period[] perArray;
    public int index;

    public int timeTillNext;
    public String currentBlock;

    public CSystem(Block[] dayArray, Period[] perArray) {
        this.dayArray = dayArray;
        this.perArray = perArray;
    }

    public void GetNumOfPer() {
        index = 0;
        for (int x = 0; x >= dayArray.length; x++) {
            if (dayArray[x].type) {
                index++;
            }
        }
    }

    public int lockUpClass(int nblock) {
        int nPeriod = 0;
        Log.i(TAG, "nblock: " + nblock);
        for (int x = 0; x < (nblock); x++) {
            Log.i(TAG, "nblock: " + nblock + " x: " + x);
            if (dayArray[x].type) {
                Log.w(TAG, "passed, " + x);
                nPeriod++;
            }
        }
        Log.w(TAG, "period: " + nPeriod);
        return nPeriod;
    }

    public void checkCurrent(int currentT) {
        int t = 8 * 60;
        Log.i(TAG, "checking time, " + currentT + " , " + t);
        Log.i(TAG, dayArray.length + "");
        for (int x = 0; x <= dayArray.length; x++) {
            t = t + dayArray[x].length;
            Log.i(TAG, "checking time, " + t + ", " + x);
            if (currentT < t) {
                timeTillNext = t - currentT;
                if (dayArray[x].type == true) { //if there is a Period on
                    Log.i(TAG, "nblock: " + x);
                    currentBlock = perArray[lockUpClass(x)].name;
                } else {
                    currentBlock = "break";
                }
                break;
            }
        }
    }
}
