package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void onBtnClick (View view){

        TextView txtHello = findViewById(R.id.mainText);
        TextView txtName = findViewById(R.id.textView);
        TextView txtLaName = findViewById(R.id.textView2);

        EditText edtTxtName = findViewById(R.id.firstName);
        EditText edtTxtLName = findViewById(R.id.lastName);
        EditText edtEmAdd = findViewById(R.id.addressTxt);
        txtHello.setText(edtTxtName.getText().toString());
        txtName.setText(edtTxtLName.getText().toString());
        txtLaName.setText(edtEmAdd.getText().toString());

    }
}
