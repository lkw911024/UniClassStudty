package com.uniclass.sangji.uniclassandroid;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Kyeongwon on 2016-11-29.
 */

public class MusicService extends Service {
    private static final String TAG = "MusicService";
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        Log.d(TAG, "onCreate()");

        player = MediaPlayer.create(this, R.raw.sweet_dream);
        player.setLooping(false);
    }

    public void onDestroy()
    {
        Toast.makeText(this, "Music Service가 종료되었습니다.",Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onDestroy()");
        player.stop();
    }

    public int onStartCommand(Intent intent, int flags, int startId)
    {
        Toast.makeText(this, "Music Service가 시작되었습니다.", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onStart()");
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }

}
