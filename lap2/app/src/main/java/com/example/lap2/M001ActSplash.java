package com.example.lap2;

import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class M001ActSplash extends AppCompatActivity {

    private int[] colors =
            {
                    R.color.purple_200,
                    R.color.purple_500,
                    R.color.purple_700,
                    R.color.teal_200,
                    R.color.teal_700
            };
    private int[] icons = {
            R.drawable.penguin,
            R.drawable.penguin2,
            R.drawable.penguin3,
            R.drawable.penguin4,
            R.drawable.penguin5
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_m001_act_splash);

        ImageView icon = findViewById(R.id.icon);
        LinearLayout background = findViewById(R.id.animal);

        Random r = new Random();
        int randomColor = colors[r.nextInt(colors.length)];
        int randomIcon = icons[r.nextInt(icons.length)];

        int color = ContextCompat.getColor(this, randomColor);
        background.setBackgroundColor(color);
        icon.setImageResource(randomIcon);

        Button thoat = findViewById(R.id.btnThoat);

        thoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.animal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
}