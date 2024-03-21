package com.example.tugasintent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BukaActJungler = new Intent(getApplicationContext(), JunglerActivity.class);
                startActivity(BukaActJungler);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaMidlaner();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaRoamer();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaGoldlaner();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BukaExplaner();
            }
        });
    }

    public void BukaMidlaner(){
        Intent BukaActMidlaner = new Intent(getApplicationContext(), MidlanerActivity.class);
        startActivity(BukaActMidlaner);
    }

    public void BukaRoamer(){
        Intent BukaActRoamer = new Intent(getApplicationContext(), RoamerActivity.class);
        startActivity(BukaActRoamer);
    }

    public void BukaGoldlaner(){
        Intent BukaActGoldlaner = new Intent(getApplicationContext(), GoldlanerActivity.class);
        startActivity(BukaActGoldlaner);
    }

    public void BukaExplaner(){
        Intent BukaActExplaner = new Intent(getApplicationContext(), ExplanerActivity.class);
        startActivity(BukaActExplaner);
    }
}