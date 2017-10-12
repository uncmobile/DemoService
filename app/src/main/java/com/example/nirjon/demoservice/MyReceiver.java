package com.example.nirjon.demoservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Nirjon on 10/10/2017.
 */

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        boolean rslt = intent.getBooleanExtra("RESULT", false);

        if(rslt) Toast.makeText(context, "It's PRIME", Toast.LENGTH_LONG).show();
        else Toast.makeText(context, "It's NOT PRIME", Toast.LENGTH_LONG).show();


    }
}
