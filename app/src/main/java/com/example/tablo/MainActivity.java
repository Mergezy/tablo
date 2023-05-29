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
                nigSurce.setText(""+(nSurce++));
            }
        });
        gerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gerSurce.setText(""+(gSurce++));
            }
        });

        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nigSurce.setText(""+(nSurce = 0));
                gerSurce.setText(""+(gSurce = 0));
            }
        });

    }
}