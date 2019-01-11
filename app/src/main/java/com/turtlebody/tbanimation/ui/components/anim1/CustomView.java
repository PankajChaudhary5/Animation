package com.turtlebody.tbanimation.ui.components.anim1;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class CustomView extends View {

    CustomView customView;
    public int baseRadius=20;
    Paint paint;
    int radius = 0;
    float min=100f , max=200f;

    public CustomView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
    }

    public void updateView(int radius) {
        this.radius = radius;
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, radius, paint);
    }


    public void startAnimate(){
        ObjectAnimator first=ObjectAnimator.ofFloat(this,"circleRadius",min,max);
        first.setDuration(1000);
        first.setRepeatMode(ObjectAnimator.REVERSE);
        first.setRepeatCount(ObjectAnimator.INFINITE);
        first.start();

        //first.start();

//        ObjectAnimator second=ObjectAnimator.ofFloat(this,"circleRadius",max,min);
//        second.setDuration(1000);
//        //second.start();

//        AnimatorSet bouncer = new AnimatorSet();
//        bouncer.play(first).after(second);
//
//        AnimatorSet bouncer1 = new AnimatorSet();
//        bouncer1.play(first).after(second);
//
//        AnimatorSet bouncer2 = new AnimatorSet();
//        bouncer2.play(bouncer).after(bouncer1);
//
//        AnimatorSet bouncer3 = new AnimatorSet();
//        bouncer3.play(bouncer).after(bouncer2);
//        bouncer3.start();


        }

    float getCircleRadius(){
      return 0f;
    }

    void setCircleRadius(float a){
        updateView(Math.round(a));

    }
}
