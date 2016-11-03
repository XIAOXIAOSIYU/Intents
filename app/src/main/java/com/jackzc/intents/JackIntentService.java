package com.jackzc.intents;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class JackIntentService extends IntentService {

    private static final String TAG = "com.jackzc.intents";

    public JackIntentService() {
        super("JackIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG, "The service has now started");
    }

}
