package com.example.nirjon.demoservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Nirjon on 10/5/2017.
 */

public class PrimalityService extends Service {
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        int n = intent.getIntExtra("PARAM", -1);

        Log.v("Tag", "We are inside service: " + n);

        boolean isprime = true;

        if(n % 2 == 0) isprime = false;

        for(int i = 3; i * i <= n && isprime; i += 2){
            if(n % i == 0) isprime = false;
        }


        Intent y = new Intent();
        y.putExtra("RESULT", isprime);
        y.setAction("com.example.nirjon.demoservice.PrimalityService");
        sendBroadcast(y);

        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {

        return null;
    }
}
