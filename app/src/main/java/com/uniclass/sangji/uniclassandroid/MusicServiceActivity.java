package com.uniclass.sangji.uniclassandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MusicServiceActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MusicService";
    Button start;
    Button stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_service);

        start = (Button) findViewById(R.id.musicStartBtn);
        stop = (Button) findViewById(R.id.musicStopBtn);

        start.setOnClickListener(this);
        stop.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
            case R.id.musicStartBtn:
                Log.d(TAG, "onClick() start");
                startService(new Intent(this, MusicService.class));
                break;
            case R.id.musicStopBtn :
                Log.d(TAG, "OnClick() stop");
                stopService(new Intent(this, MusicService.class));
                break;
        }
    }
}
