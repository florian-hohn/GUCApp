package com.example.gucapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CounterInstance inst = new CounterInstance();

        Button btn1 = findViewById(R.id.add1);
        Button btn2 = findViewById(R.id.add2);
        Button rst = findViewById(R.id.reset);

        final TextView disp1 = findViewById(R.id.disp1);
        final TextView disp2 = findViewById(R.id.disp2);
        final TextView disp3 = findViewById(R.id.disp3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = inst.getEnterCount();
                temp += 1;
                inst.setEnterCount(temp);
                inst.calculateEntered();
                disp1.setText("" + inst.getEnterCount());
                disp3.setText("" + inst.getEnteredMarket());
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int temp = inst.getLeaveCount();
                temp += 1;
                inst.setLeaveCount(temp);
                inst.calculateEntered();
                disp2.setText("" + inst.getLeaveCount());
                disp3.setText("" + inst.getEnteredMarket());
            }
        });

        rst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inst.resetCounter();
                disp1.setText("" + inst.getEnterCount());
                disp2.setText("" + inst.getLeaveCount());
                disp3.setText("" + inst.getEnteredMarket());
            }
        });
    }
}
