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

public class bai2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai2);

        EditText edt1 = findViewById(R.id.edt1);
        EditText edt2 = findViewById(R.id.edt2);
        Button btnfa = findViewById(R.id.btnfa);
        Button btnce = findViewById(R.id.btnce);
        Button btnclear = findViewById(R.id.btnclear);
        Button btnthoat = findViewById(R.id.btnthoat);

        btnthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt1.setText("");
                edt2.setText("");
            }
        });

        btnfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt2.getText().toString().isEmpty()){
                    return;
                }
                float kq = Float.parseFloat(edt2.getText().toString()) * 9/5 + 32;
                edt1.setText(String.valueOf(kq));
            }
        });

        btnce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edt1.getText().toString().isEmpty()) {
                    return;
                }
                float kq = (Float.parseFloat(edt1.getText().toString()) - 32) * 5/9;
                edt2.setText(String.valueOf(kq));
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}