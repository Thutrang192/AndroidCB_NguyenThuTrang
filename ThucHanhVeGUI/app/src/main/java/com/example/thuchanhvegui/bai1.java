package com.example.thuchanhvegui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class bai1 extends AppCompatActivity {

    TextView ketqua;
    Button tong, hieu, tich, thuong, ucln, thoat;

    private int ucln(int x, int y) {
        int tmp;
        while(y != 0) {
            tmp = x % y;
            x = y;
            y = tmp;
        }
        return x;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai1);

        EditText soa = (EditText) findViewById(R.id.soa);
        EditText sob = (EditText) findViewById(R.id.sob);
        ketqua = findViewById(R.id.ketqua);
        tong = findViewById(R.id.tong);
        hieu = findViewById(R.id.hieu);
        tich = findViewById(R.id.tich);
        thuong = findViewById(R.id.thuong);
        ucln = findViewById(R.id.ucln);
        thoat = findViewById(R.id.thoat);

        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });



        tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sob.getText().toString().isEmpty() || soa.getText().toString().isEmpty()) {
                    return;
                }
                int x = Integer.parseInt(soa.getText().toString());
                int y = Integer.parseInt(sob.getText().toString());
                int kq = x + y;
                ketqua.setText(String.valueOf(kq));
            }
        });

        hieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sob.getText().toString().isEmpty() || soa.getText().toString().isEmpty()) {
                    return;
                }
                int x = Integer.parseInt(soa.getText().toString());
                int y = Integer.parseInt(sob.getText().toString());
                int kq = x - y;
                ketqua.setText(String.valueOf(kq));
            }
        });

        tich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sob.getText().toString().isEmpty() || soa.getText().toString().isEmpty()) {
                    return;
                }
                int x = Integer.parseInt(soa.getText().toString());
                int y = Integer.parseInt(sob.getText().toString());
                int kq = x * y;
                ketqua.setText(String.valueOf(kq));
            }
        });

        thuong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sob.getText().toString().isEmpty() || soa.getText().toString().isEmpty()) {
                    return;
                }
                int x = Integer.parseInt(soa.getText().toString());
                int y = Integer.parseInt(sob.getText().toString());
                int kq = x / y;
                ketqua.setText(String.valueOf(kq));
            }
        });

        ucln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (sob.getText().toString().isEmpty() || soa.getText().toString().isEmpty()) {
                    return;
                }
                int x = Integer.parseInt(soa.getText().toString());
                int y = Integer.parseInt(sob.getText().toString());
                int kq = ucln(x, y);
                ketqua.setText(String.valueOf(kq));
            }
        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}