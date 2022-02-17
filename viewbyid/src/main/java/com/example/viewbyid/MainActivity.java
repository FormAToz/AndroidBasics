package com.example.viewbyid;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final TextView textView = findViewById(R.id.text);
        textView.setText("New text from code");

        final Button button = findViewById(R.id.button);
        button.setText("New button");
        button.setEnabled(false);

        final CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);
    }
}