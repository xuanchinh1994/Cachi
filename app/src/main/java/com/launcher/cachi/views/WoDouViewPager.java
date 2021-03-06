package com.launcher.cachi.views;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class WoDouViewPager extends ViewPager {
    private static final String TAG = "WoDouViewPager";
    private boolean d = true;
    private boolean isCanScroll = false;

    public WoDouViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return true;
    }

    @Override
    public void setOnFocusChangeListener(OnFocusChangeListener l) {
        super.setOnFocusChangeListener(l);
        if(d) Log.i(TAG, "============focused change ========");
    }

    @Override
    public void setOnTouchListener(OnTouchListener l) {
        if(d) Log.i(TAG, "============on touch dispach ========");
    }
}
