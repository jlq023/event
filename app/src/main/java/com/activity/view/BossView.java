package com.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by Administrator on 2017/10/15.
 */

public class BossView extends LinearLayout {
    private final String TAG="BossView  ";
    private int index=0;
    public BossView(Context context) {
        super(context);
    }

    public BossView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }



    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e("info",TAG+"onTouchEvent()   工作已经完毕");
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("info",TAG+"onInterceptTouchEvent()  boss将task 分配给manager");
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("info",TAG+"dispatchTouchEvent()   boss create task!");
       // return true;
        return super.dispatchTouchEvent(ev);
    }
}
