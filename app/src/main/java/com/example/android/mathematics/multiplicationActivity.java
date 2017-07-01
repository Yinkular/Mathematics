package com.example.android.mathematics;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by soyinka on 7/1/2017.
 */

public class multiplicationActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_page); // page we want to show answer to

        ArrayList<expressionAnswer> expressionAnswer = new ArrayList<>();

        // populate array list
        // loop from 1 to 10
        // add the expression showing the multipication and actual value to the list
        String expression;
        int answer;
        for (int i = 1; i <= 10; i++) {
            expression = i + " * " + i;
            answer = i * i;
            expressionAnswer.add(new expressionAnswer(expression, answer));
        }

        // create a new obejct of modified adapter
        expressionAdapter newAdapter = new expressionAdapter(this, expressionAnswer);

        ListView list = (ListView) findViewById(R.id.list);

        list.setAdapter(newAdapter);
    }
}
