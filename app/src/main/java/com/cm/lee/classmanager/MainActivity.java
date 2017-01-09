package com.cm.lee.classmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cm.lee.classmanager.classsystem.Block;
import com.cm.lee.classmanager.classsystem.CSystem;
import com.cm.lee.classmanager.classsystem.Period;
import com.cm.lee.classmanager.timingservice.TimingService;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Block[] b = new Block[18];
        b[0] = new Block(45, false);
        b[1] = new Block(45, false);
        b[2] = new Block(20, false);
        b[3] = new Block(45, true);
        b[4] = new Block(45, true);
        b[5] = new Block(10, false);
        b[6] = new Block(45, true);
        b[7] = new Block(5, false);
        b[8] = new Block(45, true);
        b[9] = new Block(30, false);
        b[10] = new Block(45, true);
        b[11] = new Block(5, false);
        b[12] = new Block(45, true);
        b[13] = new Block(5, false);
        b[14] = new Block(45, false);
        b[15] = new Block(5, false);
        b[16] = new Block(45, false);
        b[17] = new Block(45, false);

        Period[] per = new Period[6];
        per[0] = new Period("physics");
        per[1] = new Period("physics");
        per[2] = new Period("Hebrew");
        per[3] = new Period("math");
        per[4] = new Period("math");
        per[5] = new Period("sports");

        final CSystem day = new CSystem(b, per);
        day.GetNumOfPer();

        final Button button = (Button) findViewById(R.id.get);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "chack " + TimingService.GetTimeInMin());
                day.checkCurrent(TimingService.GetTimeInMin());
                Toast.makeText(getApplicationContext(), "the time now is: " + TimingService.GetTimeFormatted(TimingService.GetTimeInMin()) +
                        " , the current thing is: " + day.currentBlock + ", and you have " + day.timeTillNext + " minutes till the next thing", Toast.LENGTH_SHORT).show();
            }
        });

        final Button button2 = (Button) findViewById(R.id.set);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "the time now is: " + TimingService.GetTimeFormatted(TimingService.GetTimeInMin()), Toast.LENGTH_SHORT).show();
            }
        });
    }


}