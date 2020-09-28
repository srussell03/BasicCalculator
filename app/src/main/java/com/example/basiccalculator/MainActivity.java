package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity {
    TextView numDisplay;
    SimpleExpression expression;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numDisplay = (TextView)findViewById(R.id.display_textView);
        expression = new SimpleExpression();
    }

    public void goOperand(View v){
        String val = (String) numDisplay.getText();
        String digit = (String) v.getContentDescription();
        if(val.charAt(0) == '0'){
            numDisplay.setText(digit);
        }
        else{
            numDisplay.setText(val + digit);
        }
    }
    public void goOperator(View v){
        String operator = (String) v.getContentDescription();
        try{
            String val = (String) numDisplay.getText();
            expression.setOperand1((int) Integer.parseInt(val));
        } catch (NumberFormatException e){
            expression.setOperand1(0);
        }
        numDisplay.setText(R.string.zero);
        expression.setOperator(operator);
    }
    public void goCompute(View view){
        try{
            String val = (String)numDisplay.getText();
            expression.setOperand2((int) Integer.parseInt(val));
        } catch (NumberFormatException e){
            expression.setOperand2(0);
        }
        numDisplay.setText(expression.getValue().toString());
    }
    public void goAC(View view){
        expression.clearOperands();
        numDisplay.setText(R.string.zero);
    }
}