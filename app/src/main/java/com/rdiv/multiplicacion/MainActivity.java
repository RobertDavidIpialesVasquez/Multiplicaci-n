package com.rdiv.multiplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edNum1, edNum2;
    TextView tvResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edNum1 = findViewById(R.id.txtnumero);
        edNum2 = findViewById(R.id.txtnumerodos);
        tvResultado = findViewById(R.id.tvResultado); 
    }

}
