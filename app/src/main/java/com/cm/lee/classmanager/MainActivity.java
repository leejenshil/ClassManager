package com.cm.lee.classmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cm.lee.classmanager.classsystem.Block;
import com.cm.lee.classmanager.classsystem.CSystem;
import com.cm.lee.classmanager.timingservice.TimingService;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Block[] b = new Block[18];
        b[0] = new Block(45, "break");
        b[1] = new Block(45, "break");
        b[2] = new Block(20, "break");
        b[3] = new Block(45, "physics");
        b[4] = new Block(45, "physics");
        b[5] = new Block(10, "break");
        b[6] = new Block(45, "Hebrew");
        b[7] = new Block(5, "break");
        b[8] = new Block(45, "Math");
        b[9] = new Block(30, "break");
        b[10] = new Block(45, "Math");
        b[11] = new Block(5, "break");
        b[12] = new Block(45, "Math");
        b[13] = new Block(5, "break");
        b[14] = new Block(45, "break");
        b[15] = new Block(5, "break");
        b[16] = new Block(45, "break");
        b[17] = new Block(45, "break");

        final CSystem day = new CSystem(b);
        //day.GetNumOfPer();

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