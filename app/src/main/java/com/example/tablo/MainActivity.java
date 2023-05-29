package com.example.tablo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int nSurce = 0;
    private int gSurce = 0;
    private TextView nigSurce;
    private TextView gerSurce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nigButn = findViewById(R.id.nigButton);
        Button gerBtn = findViewById(R.id.gerButton);
        Button resetButton = findViewById(R.id.resetButton);

        nigSurce = findViewById(R.id.nigSurce);
        gerSurce = findViewById(R.id.gerSurce);

        nigButn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nSurce++;
                updateScore();
            }
        });
        gerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gSurce++;
                updateScore();
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nSurce = 0;
                gSurce = 0;
                updateScore();
            }
        });
        updateScore();
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("score1", nSurce);
        outState.putInt("score2", gSurce);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null) {
            nSurce = savedInstanceState.getInt("score1");
            gSurce = savedInstanceState.getInt("score2");
            updateScore();
        }
    }
    private void updateScore() {
        nigSurce.setText("" + nSurce);
        gerSurce.setText("" + gSurce);
    }


}