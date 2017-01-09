package com.cm.lee.classmanager.timingservice;

import java.util.Calendar;

/**
 * Created by lee on 30/12/2016.
 */
public class TimingService {
    public static Calendar c = Calendar.getInstance();

    public static int GetTimeInMin() {
        c = Calendar.getInstance();
        int TimeInMinutes = c.get(Calendar.MINUTE) + (c.get(Calendar.HOUR_OF_DAY) * 60);

        return TimeInMinutes;
    }

    public static String GetTimeFormatted(int timeInMin) {
        String time = "";
        int minutes = timeInMin % 60;
        int hours = timeInMin/60;
        time = hours + ":" + minutes;
        return time;
    }
}
