package com.uniclass.sangji.uniclassandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ExtrasSubActivity extends AppCompatActivity {

    EditText edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras_sub);

        edit = (EditText) findViewById(R.id.extras_sub_et);
        Button okbtn = (Button) findViewById(R.id.extras_sub_okBtn);
        okbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("INPUT_TEXT", edit.getText().toString());
                setResult(RESULT_OK, intent);
                finish();
            }
        });

        Button cancelBtn = (Button) findViewById(R.id.extras_sub_cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("CANCEL_TEXT", "취소되었습니다.");
                setResult(RESULT_CANCELED, intent);
                finish();
            }
        });

    }
}
