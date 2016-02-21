package com.example.jmdra.myfirstserviceapplication;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MainIntentService extends IntentService {

    private static final String TAG = "My LOG";

    public MainIntentService() {
        super("MainIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //This is what the service does
        Log.i(TAG, "The service has now started");
    }
}
