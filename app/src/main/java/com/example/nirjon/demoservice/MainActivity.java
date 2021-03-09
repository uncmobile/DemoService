package com.example.nirjon.demoservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    BroadcastReceiver br = null;
    IntentFilter ifter = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        br = new MyReceiver();
        ifter = new IntentFilter("com.example.servicehomes.MyService");
        registerReceiver(br, ifter);
    }

    public void foo(View v)
    {
        Log.v("Tag", "clicked ...");

        Intent x = new Intent(this, PrimalityService.class);
        x.putExtra("PARAM", 599);
        startService(x);
    }

}
