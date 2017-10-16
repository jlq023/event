package com.activity.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/10/15.
 */

public class EmployeesView extends android.support.v7.widget.AppCompatTextView {
    private final String TAG="EmployeesView";

    public EmployeesView(Context context) {
        super(context);
    }

    public EmployeesView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public EmployeesView(Context context, AttributeSet attrs){
        super(context, attrs);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {

        int index = new Random().nextInt(2);
//        if(index==0){
            Log.i("info",TAG+" 员工圆满完成任务.");
            return super.onTouchEvent(event);
//        }else {
           // Log.i("info",TAG+" 难度太大，任务无法完成.");
           // return true;
//        }

    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i("info",TAG+" 员工开始工作.");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        Paint mPaint1 = new Paint();
        mPaint1.setColor(getResources().getColor(android.R.color.holo_blue_light));
        mPaint1.setStyle(Paint.Style.FILL);
        Paint mPaint2 = new Paint();
        mPaint2.setColor(Color.YELLOW);
        mPaint2.setStyle(Paint.Style.FILL);
        //绘制外层矩形
        canvas.drawRect(0, 0, getMeasuredWidth(),getMeasuredHeight(), mPaint1);
        //绘制内层矩形
        canvas.drawRect(10, 10, getMeasuredWidth()-10, getMeasuredHeight()-10, mPaint2);
        canvas.save();
        //绘制文字前平移10像素
        canvas.translate(10, 0);
        super.onDraw(canvas);
        canvas.restore();
    }
}
