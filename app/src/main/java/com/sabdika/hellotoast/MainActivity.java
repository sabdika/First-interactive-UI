package com.sabdika.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE =  "com.example.homework.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String test = String.valueOf(mCount);
        intent.putExtra(EXTRA_MESSAGE, test);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount !=null){
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}