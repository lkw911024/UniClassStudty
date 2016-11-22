package com.uniclass.sangji.uniclassandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {
    TextView calculatorInput;
    TextView calculatorOutput;
    //462 

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        calculatorInput = (TextView)findViewById(R.id.calculatorInput);
        calculatorOutput = (TextView)findViewById(R.id.calculatorOutput);
    }

    public void onClickedBtn(View v)
    {
        Button btn = (Button) v;

        String inputData = new String(btn.getText().toString());

        calculatorInput.append(" " + inputData + " ");

        if(Character.isDigit(inputData.charAt(0)))
        {
            if(calculatorOutput.getText().toString().isEmpty())
            {
                calculatorOutput.setText(inputData);
            }
            else
            {
                int firstData = Integer.parseInt(calculatorOutput.getText().toString());
                int secondData = Integer.parseInt(inputData);

                String input = new String(calculatorInput.getText().toString());
                char oper = input.charAt(input.length() - 5);

                if(oper == '+')
                {
                    calculatorOutput.setText(firstData + secondData + "");
                }
                else if(oper == '-')
                {
                    calculatorOutput.setText(firstData - secondData + "");
                }
                else if(oper == 'x')
                {
                    calculatorOutput.setText(firstData * secondData + "");
                }
                else if(oper == '/')
                {
                    calculatorOutput.setText(firstData / secondData + "");
                }
            }
        }
    }

    public void onClickedEqualsBtn(View v)
    {
        calculatorInput.setText(calculatorOutput.getText());
    }

    public void onClickedClearBtn(View v)
    {
        calculatorInput.setText("");
        calculatorOutput.setText("");
    }

    public void onClickedDeleteBtn(View v)
    {
        String str = new String(calculatorInput.getText().toString());

        if(!str.isEmpty())
        {
            calculatorInput.setText(str.substring(0,str.length() - 3));
        }
    }

}
