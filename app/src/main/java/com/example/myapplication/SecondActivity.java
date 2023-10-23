package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        RelativeLayout layout = findViewById(R.id.secondLayout);

        Intent intent = getIntent();
        String color = intent.getStringExtra("color");

        TextView tW = new TextView(this);
        tW.setText("Неизвестный цвет");
        tW.setTextSize(24);
        tW.setTextColor(getResources().getColor(R.color.black));

        if (color != null) {
            switch (color) {
                case "red":
                    layout.setBackgroundColor(getResources().getColor(R.color.colorRed));
                    break;
                case "green":
                    layout.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                    break;
                case "blue":
                    layout.setBackgroundColor(getResources().getColor(R.color.colorBlue));
                    break;
                default:
                    layout.addView(tW);
                    break;
            }
        }
    }
}
