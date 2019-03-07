package com.example.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d("Thanh", "onCreate: detail");
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        Toast.makeText(this,"press",Toast.LENGTH_LONG).show();
    }
}
