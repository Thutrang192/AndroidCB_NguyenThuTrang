package com.example.lap2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton icon_home;
    ImageButton icon_profile;
    ImageButton icon_app;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        icon_home = findViewById(R.id.icon_home);
        icon_profile = findViewById(R.id.icon_profile);
        icon_app = findViewById(R.id.icon_app);

        icon_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(MainActivity.this, M001ActSplash.class);
                startActivity(home);
            }
        });

        icon_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profile = new Intent(MainActivity.this, M001ActProfile.class);
                startActivity(profile);
            }
        });

        icon_app.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent app = new Intent(MainActivity.this, app.class);
                startActivity(app);
            }
        });


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });




    }
}