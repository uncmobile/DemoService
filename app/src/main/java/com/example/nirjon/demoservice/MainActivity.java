package com.example.nirjon.demoservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void foo(View v)
    {
        Log.v("Tag", "clicked ...");

        Intent x = new Intent(this, PrimalityService.class);
        x.putExtra("PARAM", 599);
        startService(x);
    }

}
