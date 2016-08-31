package com.king1033.eventdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;

import java.util.List;

/**
 * @Author:king1033
 * @Desc:
 * @Time:2016/8/31
 */
public class CustomListView extends ListView{
    public CustomListView(Context context) {
        super(context);
    }

    public CustomListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
       switch(ev.getAction()){

       }
        return super.onTouchEvent(ev);

    }
}
