package com.uniclass.sangji.uniclassandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExtrasActivity extends AppCompatActivity {

    static final int GET_STRING = 1;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras_acticity);

        Button btn = (Button) findViewById(R.id.extras_btn);
        text = (TextView) findViewById(R.id.extras_tv2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(ExtrasActivity.this, ExtrasSubActivity.class);
                startActivityForResult(in, GET_STRING);            }
        });
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if(requestCode == GET_STRING)
        {
            if(resultCode == RESULT_OK)
            {
                text.setText(data.getStringExtra("INPUT_TEXT"));
            }
            else
            {
                text.setText(data.getStringExtra("CANCEL_TEXT"));
            }
        }
    }
}
