package com.uniclass.sangji.uniclassandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {
    LinearLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        lay = (LinearLayout)findViewById(R.id.layout_linear01);
    }

    public void onClickedLayoutBtn01(View v)
    {
        Toast.makeText(getApplicationContext(),"수평으로 전환", Toast.LENGTH_SHORT).show();

        lay.setOrientation(LinearLayout.HORIZONTAL);
    }

    public void onClickedLayoutBtn02(View v)
    {
        Toast.makeText(getApplicationContext(),"수직으로 전환", Toast.LENGTH_SHORT).show();

        lay.setOrientation(LinearLayout.VERTICAL);
    }

}
