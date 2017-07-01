package com.example.android.mathematics;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by soyinka on 7/1/2017.
 */

public class expressionAdapter extends ArrayAdapter<expressionAnswer> {
    // constructor accepts the current context and the array list
    public expressionAdapter(Activity context, ArrayList<expressionAnswer> expression) {
        super(context, 0, expression);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parentView) {
        // list item view is the view that contains the strucure of the list
        View listItemView = convertView;

        if (listItemView == null) // if it is empty
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    // inflate using the structure containing two text view
                    R.layout.list_structure, parentView, false);
        }

        // get current value to work on
        expressionAnswer expression = getItem(position);

        // get the text view to contain each part of the expression object
        TextView firstExpression = (TextView) listItemView.findViewById(R.id.expression);
        firstExpression.setText(expression.getExpression());

        TextView firstAnswer = (TextView) listItemView.findViewById(R.id.answer);
        firstAnswer.setText(expression.getAnswer() + "");

        return listItemView; // return the currently populated view
    }
}
