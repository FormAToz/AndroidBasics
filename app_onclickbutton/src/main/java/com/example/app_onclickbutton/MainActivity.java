package com.example.app_onclickbutton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    /* способ создания обработчика, без создания объекта для каждой кнопки */
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(final View view) {
        switch (view.getId()) {
            case R.id.btnOk:
                tvOut.setText("OK button was pressed");
                break;
            case R.id.btnCancel:
                tvOut.setText("Cancel button was pressed");
        }
    }

    /* способ создания обработчика с описанием и привязкой внутри кнопки в xml-файле */
    public void tryMe(final View view) {
        tvOut.setText("XML button was pressed");
    }
}