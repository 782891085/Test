package com.example.administrator.myapplication1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Administrator on 2016/6/6 0006.
 */
public class MyView extends View
{
    private Paint mCirclePaint;
    private Paint mArcPaint;

    public MyView(Context context)
    {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init()
    {
        mCirclePaint = new Paint();
        mCirclePaint.setColor(Color.RED);
        mArcPaint = new Paint();
        mArcPaint.setColor(Color.GREEN);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, getMeasuredWidth() / 4, mCirclePaint);
    }
}
