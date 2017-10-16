package com.activity.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

import java.util.Random;

/**
 * Created by Administrator on 2017/10/15.
 */

public class ManagerView extends LinearLayout {
    private final String TAG="ManagerView  ";
    private int index=0;
    public ManagerView(Context context) {
        super(context);
    }

    public ManagerView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(index==0){
            Log.i("info",TAG+" onTouchEvent() 经理验收任务结果，并向老板报告");
        }else{
            Log.i("info",TAG+" onTouchEvent()  自己亲自来完成任务");
        }
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        index = 0;
//        if(index==0){
//            Log.i("info",TAG+"onInterceptTouchEvent()经理接收到任务,将任务分配给员工");
//            return super.onInterceptTouchEvent(ev);
//        }else{
            Log.i("info",TAG+"onInterceptTouchEvent()经理接收到任务安排，员工做得不好，自己来做任务");
            return true;
//        }

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("info",TAG+"经理让onInterceptTouchEvent决定任务由谁完成");
        return super.dispatchTouchEvent(ev);
    }
}
