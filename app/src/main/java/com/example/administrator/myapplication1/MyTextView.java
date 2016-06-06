package com.example.administrator.myapplication1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/6/6 0006.
 */
public class MyTextView extends TextView
{
    private static final String TAG = "MyTextView";
    private Paint mPaint;
    private Paint mPaint1;

    public MyTextView(Context context)
    {
        super(context);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        mPaint = new Paint();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.RED);
        mPaint1 = new Paint();
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint1.setColor(Color.BLUE);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        canvas.drawRect(0, 0, getMeasuredWidth(), getMeasuredHeight(), mPaint);

        canvas.drawRect(10, 10, getMeasuredWidth() - 10, getMeasuredHeight() - 10, mPaint1);
        //save：用来保存Canvas的状态。save之后，可以调用Canvas的平移、放缩、旋转、错切、裁剪等操作。
        canvas.save();
        canvas.translate(10, 0);
        super.onDraw(canvas);
        //restore：用来恢复Canvas之前保存的状态。防止save后对Canvas执行的操作对后续的绘制有影响。
        canvas.restore();
    }
}
