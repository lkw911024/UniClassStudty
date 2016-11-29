package com.uniclass.sangji.uniclassandroid;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import java.util.Random;

/**
 * Created by Kyeongwon on 2016-11-29.
 */

public class LocalService extends Service {
    private final IBinder mBinder = new LocalBinder();
    private final Random mGenerator = new Random();

    public class LocalBinder extends Binder {
        LocalService getService(){
            return LocalService.this;
        }
    }

    public IBinder onBind(Intent intent){
        return mBinder;
    }

    public int getRandomNumber()
    {
        return mGenerator.nextInt(100);
    }
}
