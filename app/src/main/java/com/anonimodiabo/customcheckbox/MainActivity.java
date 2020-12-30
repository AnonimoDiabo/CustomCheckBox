package com.anonimodiabo.customcheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbAndroid, cbJava, cbPhp;
    TextView tvOutput;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbAndroid = findViewById(R.id.cb_android);
        cbJava = findViewById(R.id.cb_java);
        cbPhp = findViewById(R.id.cb_php);
        btnSubmit = findViewById(R.id.btn_submit);
        tvOutput = findViewById(R.id.tv_output);

        cbAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbAndroid.isChecked()){
                    cbAndroid.setTextColor(getResources().getColor(R.color.colorAccent));
                }else {
                    cbAndroid.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });
        cbJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbJava.isChecked()){
                    cbJava.setTextColor(getResources().getColor(R.color.colorAccent));
                }else {
                    cbJava.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        cbPhp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cbPhp.isChecked()){
                    cbPhp.setTextColor(getResources().getColor(R.color.colorAccent));
                }else {
                    cbPhp.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String s="";
                    if (cbAndroid.isChecked()) {
                        s += "\n Android";
                    }
                    if (cbJava.isChecked()) {
                        s += "\n Java";
                    }
                    if (cbPhp.isChecked()) {
                        s += "\n Php";
                    }

                    if(s.isEmpty()){
                        tvOutput.setText("");
                        Toast.makeText(MainActivity.this, "Please Select any programming language", Toast.LENGTH_SHORT).show();
                    }else {
                        tvOutput.setText(s);
                    }


            }
        });
    }
}
