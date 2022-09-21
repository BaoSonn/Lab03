package com.example.lab03;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

public class optionActivity extends AppCompatActivity {
    private int index1=0, index2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.optionactive);
        Spinner spinner1 = (Spinner)findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                index1 = arg2; // get index
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) { }
        });
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {
                index2 = arg2; // get index
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) { }
        });
    }
            public void onOK(View view) {
                Intent intent = new Intent();
                Bundle bundle = new Bundle();
                bundle.putInt("ForeColor", index1);
                bundle.putInt("BackColor", index2);
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();
            }
}

