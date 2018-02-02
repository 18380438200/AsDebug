package com.example.asdebug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test();
    }

    private void test(){
        int total = 0;
        for(int i=0;i<10;i++){
            total++;
        }
        total *= 2;

        addNum(total);

        for(int i=0;i<10;i++){
            total++;
        }
    }

    private void addNum(int total){
        for(int i=0;i<10;i++){
            total++;
        }
        total = (int) (total + Math.random() * 4);
        total ++;
    }
}
