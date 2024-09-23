package com.example.thuchanhvegui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class bai3 extends AppCompatActivity {

    EditText edtChieucao, edtCannang, edtBMI, edtChuandoan;
    Button btnTinhBMI, btnthoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai3);

        edtChieucao = findViewById(R.id.edtChieucao);
        edtCannang = findViewById(R.id.edtCannang);
        edtBMI = findViewById(R.id.edtBMI);
        edtChuandoan = findViewById(R.id.edtChuandoan);
        btnTinhBMI = findViewById(R.id.btnTinhBMI);
        btnthoat = findViewById(R.id.btnthoat);

        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnTinhBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double cc = Double.parseDouble(edtChieucao.getText().toString());
                double cn = Double.parseDouble(edtCannang.getText().toString());
                double bmi = cn/Math.pow(cc, 2);
                String chuandoan = "";

                if (bmi < 18) {
                    chuandoan = "Ban gay";
                } else if (bmi <= 24.9) {
                    chuandoan = "Ban binh thuong";
                } else if (bmi <= 29.9) {
                    chuandoan = "Ban beo phi cap do 1";
                } else if (bmi <= 34.9) {
                    chuandoan = "Ban beo phi cap do 2";
                } else {
                    chuandoan = "Ban beo phi cap do 3";
                }

                DecimalFormat dcf = new DecimalFormat("#.0");
                edtBMI.setText(dcf.format(bmi));
                edtChuandoan.setText(chuandoan);

            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}