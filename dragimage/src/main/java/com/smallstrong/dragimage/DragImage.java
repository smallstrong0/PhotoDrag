package com.smallstrong.dragimage;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;


/**
 * Created by mac on 2017/4/6.
 */

public class DragImage extends PhotoView {
    private float downX, downY;
    private float upX, upY;
    private float moveX, moveY;
    private float tranX,tranY;

    public DragImage(Context context) {
        this(context, null);
    }

    public DragImage(Context context, AttributeSet attr) {
        this(context, attr, 0);
    }

    public DragImage(Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);
        DisplayMetrics dm = getResources().getDisplayMetrics();
        screenWidth = dm.widthPixels;
        screenHeight = dm.heightPixels - 100;//这里减去的100是下边的back键和menu键那一栏的高度，看情况而定

    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    int lastX,lastY,getLastX,getLastY,screenWidth,screenHeight;

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
//        switch (event.getAction()) {
//            case MotionEvent.ACTION_DOWN:
//                Log.i("small=ACTION_DOWN", event.getX() + "====" + event.getY());
//                downX = event.getX();
//                downY = event.getY();
//                break;
//
//            case MotionEvent.ACTION_MOVE:
//                Log.i("small=ACTION_MOVE", event.getX() + "====" + event.getY());
//                moveY = event.getY();
//                moveX = event.getX();
//                tranX = moveX - downX;
//                tranY = moveY - downY;
//
//
//
//                break;
//
//            case MotionEvent.ACTION_UP:
//                upX = event.getX();
//                upY = event.getY();
//                Log.i("small=ACTION_UP", event.getX() + "====" + event.getY());
//                break;
//
//        }

//        switch (ev.getAction()){
//            case MotionEvent.ACTION_DOWN:
//                lastX = (int) ev.getRawX();//设定移动的初始位置相对位置
//                lastY = (int) ev.getRawY();
//                break;
//            case MotionEvent.ACTION_MOVE://移动
//                if(ev.getPointerCount() == 1){}
//                //event.getRawX()事件点距离屏幕左上角的距离
//                int dx = (int) ev.getRawX() - lastX;
//                int dy = (int) ev.getRawY() - lastY;
//
//                int left = this.getLeft() + dx;
//                int top = this.getTop() + dy;
//                int right = this.getRight() + dx;
//                int bottom = this.getBottom() + dy;
//                if (left < 0) { //最左边
//                    left = 0;
//                    right = left + this.getWidth();
//                }
//                if (right > screenWidth) { //最右边
//                    right = screenWidth;
//                    left = right - this.getWidth();
//                }
//                if (top < 0) {  //最上边
//                    top = 0;
//                    bottom = top + this.getHeight();
//                }
//                if (bottom > screenHeight) {//最下边
//                    bottom = screenHeight;
//                    top = bottom - this.getHeight();
//                }
//                this.layout(left, top, right, bottom);//设置控件的新位置
////                LogTool.e("position:" + left + ", " + top + ", " + right + ", " + bottom);
//                lastX = (int) ev.getRawX();//再次将滑动其实位置定位
//                lastY = (int) ev.getRawY();
//                break;
//            case MotionEvent.ACTION_UP:
//
//                break;
//        }
////        return super.onInterceptTouchEvent(ev);
        return super.dispatchTouchEvent(ev);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }
}

