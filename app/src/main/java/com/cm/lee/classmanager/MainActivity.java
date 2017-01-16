package com.cm.lee.classmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.cm.lee.classmanager.classsystem.Block;
import com.cm.lee.classmanager.classsystem.CSDay;
import com.cm.lee.classmanager.classsystem.CSystem;
import com.cm.lee.classmanager.timingservice.TimingService;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Block[] w1 = new Block[18];
        w1[0] = new Block(45, "break");
        w1[1] = new Block(45, "break");
        w1[2] = new Block(20, "break");
        w1[3] = new Block(45, "physics");
        w1[4] = new Block(45, "physics");
        w1[5] = new Block(10, "break");
        w1[6] = new Block(45, "Hebrew");
        w1[7] = new Block(5, "break");
        w1[8] = new Block(45, "Math");
        w1[9] = new Block(30, "break");
        w1[10] = new Block(45, "Math");
        w1[11] = new Block(5, "break");
        w1[12] = new Block(45, "Math");
        w1[13] = new Block(5, "break");
        w1[14] = new Block(45, "break");
        w1[15] = new Block(5, "break");
        w1[16] = new Block(45, "break");
        w1[17] = new Block(45, "break");

        Block[] w2 = new Block[18];
        w2[0] = new Block(45, "chemistry");
        w2[1] = new Block(45, "chemistry");
        w2[2] = new Block(20, "break");
        w2[3] = new Block(45, "break");
        w2[4] = new Block(45, "break");
        w2[5] = new Block(10, "break");
        w2[6] = new Block(45, "Hebrew");
        w2[7] = new Block(5, "break");
        w2[8] = new Block(45, "History");
        w2[9] = new Block(30, "break");
        w2[10] = new Block(45, "Biology");
        w2[11] = new Block(5, "break");
        w2[12] = new Block(45, "Biology-L");
        w2[13] = new Block(5, "break");
        w2[14] = new Block(45, "break");
        w2[15] = new Block(5, "break");
        w2[16] = new Block(45, "break");
        w2[17] = new Block(45, "break");

        Block[] w3 = new Block[18];
        w3[0] = new Block(45, "break");
        w3[1] = new Block(45, "Biology");
        w3[2] = new Block(20, "break");
        w3[3] = new Block(45, "bible");
        w3[4] = new Block(45, "Jewish Thought");
        w3[5] = new Block(10, "break");
        w3[6] = new Block(45, "Education");
        w3[7] = new Block(5, "break");
        w3[8] = new Block(45, "Social Justice");
        w3[9] = new Block(30, "break");
        w3[10] = new Block(45, "Math");
        w3[11] = new Block(5, "break");
        w3[12] = new Block(45, "break");
        w3[13] = new Block(5, "break");
        w3[14] = new Block(45, "break");
        w3[15] = new Block(5, "break");
        w3[16] = new Block(45, "break");
        w3[17] = new Block(45, "break");

        Block[] w4 = new Block[18];
        w4[0] = new Block(45, "break");
        w4[1] = new Block(45, "break");
        w4[2] = new Block(20, "break");
        w4[3] = new Block(45, "Math");
        w4[4] = new Block(45, "Math");
        w4[5] = new Block(10, "break");
        w4[6] = new Block(45, "History");
        w4[7] = new Block(5, "break");
        w4[8] = new Block(45, "History");
        w4[9] = new Block(30, "break");
        w4[10] = new Block(45, "physics");
        w4[11] = new Block(5, "break");
        w4[12] = new Block(45, "physics");
        w4[13] = new Block(5, "break");
        w4[14] = new Block(45, "English");
        w4[15] = new Block(5, "break");
        w4[16] = new Block(45, "English");
        w4[17] = new Block(45, "English");

        Block[] w5 = new Block[18];
        w5[0] = new Block(45, "Sports");
        w5[1] = new Block(45, "Bible");
        w5[2] = new Block(20, "break");
        w5[3] = new Block(45, "Jewish Thought");
        w5[4] = new Block(45, "Jewish Thought");
        w5[5] = new Block(10, "break");
        w5[6] = new Block(45, "Hebrew");
        w5[7] = new Block(5, "break");
        w5[8] = new Block(45, "Education");
        w5[9] = new Block(30, "break");
        w5[10] = new Block(45, "Hebrew");
        w5[11] = new Block(5, "break");
        w5[12] = new Block(45, "break");
        w5[13] = new Block(5, "break");
        w5[14] = new Block(45, "break");
        w5[15] = new Block(5, "break");
        w5[16] = new Block(45, "break");
        w5[17] = new Block(45, "break");

        CSDay[] week = new CSDay[7];
        week[0] = new CSDay(w1,1);
        week[1] = new CSDay(w2,2);
        week[2] = new CSDay(w3,3);
        week[3] = new CSDay(w4,4);
        week[4] = new CSDay(w5,5);

        CSystem syst = new CSystem(week);

        //day.GetNumOfPer();

        final Button button = (Button) findViewById(R.id.get);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "chack " + TimingService.GetTimeInMin());
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