package com.example.bai2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton diceImg;
    Random r = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

            diceImg = findViewById(R.id.dice_image);

            diceImg.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ramdom_dice();
                }
            });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void ramdom_dice() {
        int random = r.nextInt(6) + 1;
        int img;

        switch (random) {
            case 1:
                img = R.drawable.dice_1;
                break;
            case 2:
                img = R.drawable.dice_2;
                break;
            case 3:
                img = R.drawable.dice_3;
                break;
            case 4:
                img = R.drawable.dice_4;
                break;
            case 5:
                img = R.drawable.dice_5;
                break;
            case 6:
                img = R.drawable.dice_6;
                break;
            default:
                img = R.drawable.dice_1;
        }

        diceImg.setImageResource(img);
    }
}