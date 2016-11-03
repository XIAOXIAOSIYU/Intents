package com.jackzc.intents;

import android.app.ExpandableListActivity;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "com.jackzc.intents";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i(TAG, "onStartCommand method called");

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    long timer = System.currentTimeMillis() + 5000;
                    while (System.currentTimeMillis() < timer) {
                        synchronized (this){
                            try {
                                wait(timer - System.currentTimeMillis());
                                Log.i(TAG, "Service is doing something");
                            } catch (Exception ex) {

                            }
                        }
                    }
                }
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        return Service.START_STICKY;

    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "onDestroy method called");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
