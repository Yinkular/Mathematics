package com.example.android.mathematics;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstView = (TextView) findViewById(R.id.addition);
        TextView secondView = (TextView) findViewById(R.id.multiplication);
        TextView thirdView = (TextView) findViewById(R.id.power);

        // on click listener for addition button
        firstView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, additionActivity.class);
                startActivity(intent);
            }
        });

        // on click listener for multiplication button
        secondView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, multiplicationActivity.class);
                startActivity(intent);
            }
        });

        // on click listener for power button
        thirdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, powerActivity.class);
                startActivity(intent);
            }
        });
    }
}
