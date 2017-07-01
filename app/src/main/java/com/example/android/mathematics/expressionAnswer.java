package com.example.android.mathematics;

/**
 * Created by soyinka on 7/1/2017.
 */

public class expressionAnswer {

    private String expression;
    private int answer;

    public expressionAnswer(String expression, int answer) {
        this.expression = expression;
        this.answer = answer;
    }

    public String getExpression() {
        return this.expression;
    }

    public int getAnswer() {
        return this.answer;
    }
}
