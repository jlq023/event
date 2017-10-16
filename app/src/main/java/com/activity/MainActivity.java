package com.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.activity.util.Util;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener{
    private Button eventId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eventId= (Button) findViewById(R.id.eventId);
        eventId.setOnClickListener(this);
        eventId.setOnLongClickListener(this);

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("info","MainActivity--dispatchTouchEvent()"+ Util.getTouchAction(ev.getAction()));
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View v) {
        Log.i("info","Button==onclick");
    }

    @Override
    public boolean onLongClick(View v) {
        Log.i("info","Button==onLongClick()");
        return true;
    }
}
