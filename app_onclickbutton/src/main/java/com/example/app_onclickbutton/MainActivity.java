package com.example.app_onclickbutton;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "myLogs";

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Log.d(TAG, "Variables initialization");
        tvOut = findViewById(R.id.tvOut);
        btnOk = findViewById(R.id.btnOk);
        btnCancel = findViewById(R.id.btnCancel);

        Log.d(TAG, "Setting click listeners");
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);
    }

    /* способ создания обработчика, без создания объекта для каждой кнопки */
    @SuppressLint({"NonConstantResourceId", "SetTextI18n"})
    @Override
    public void onClick(final View view) {
        Log.d(TAG, "Getting a source of event");

        switch (view.getId()) {
            case R.id.btnOk:
                Log.d(TAG, "Ok button was pressed");
                tvOut.setText("OK button was pressed");
                Toast.makeText(this, "OK button was pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnCancel:
                Log.d(TAG, "Cancel button was pressed");
                tvOut.setText("Cancel button was pressed");
                Toast.makeText(this, "Cancel button was pressed", Toast.LENGTH_SHORT).show();
        }
    }

    /* способ создания обработчика с описанием и привязкой внутри кнопки в xml-файле */
    public void tryMe(final View view) {
        Log.d(TAG, "XML button was pressed");
        tvOut.setText("XML button was pressed");
        Toast.makeText(this, "XML button was pressed", Toast.LENGTH_SHORT).show();
    }
}