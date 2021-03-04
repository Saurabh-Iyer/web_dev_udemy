package com.example.week_2_lab_29759102_saurabh_iyer;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public static final String BASE_MESSAGE = "We added a new car";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view){
        EditText editText = (EditText) findViewById(R.id.makerName);
        String message = "We Added a new car(" + editText.getText().toString() + ")";
        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();


    }

}