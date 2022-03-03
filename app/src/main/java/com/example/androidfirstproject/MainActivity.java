package com.example.androidfirstproject;

import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final LinearLayout llBottom = findViewById(R.id.llBottom);
        llBottom.setBackgroundResource(R.color.llBottomColor);

        final TextView tView = findViewById(R.id.tvBottom);
        tView.setText(R.string.tvTopText);

        final Button btn = findViewById(R.id.btnBottom);
        btn.setText(R.string.btnBottomText);
    }
}