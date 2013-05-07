package com.udinic.ActivitySplitAnimation;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Gravity;
import android.view.WindowManager;

import android.widget.ImageView;
import com.udinic.ActivitySplitAnimation.utils.ActivitySplitAnimationUtil;

public class Activity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Preparing the 2 images to be split
        int cutSize = 120;
        ActivitySplitAnimationUtil.prepareAnimation(this);
        
//        ImageView imageView = new ImageView(this);
//        imageView.setImageBitmap(bm);
//
//        WindowManager.LayoutParams windowParams = new WindowManager.LayoutParams();
//        windowParams.gravity = Gravity.TOP;
//        windowParams.x = 0;
//        windowParams.y = loc[2] + loc[0];
//        windowParams.height = loc[1] - loc[0];
//        windowParams.width = bmp.getWidth();
//        windowParams.flags = WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN;
//        windowParams.format = PixelFormat.TRANSLUCENT;
//        windowParams.windowAnimations = 0;
//        destActivity.getWindowManager().addView(imageView, windowParams);

        setContentView(R.layout.act_two);

        // Animating the items to be open, revealing the new activity
        ActivitySplitAnimationUtil.animate(this, 3000);
    }

    @Override
    protected void onStop() {
        // If we're currently running the entrance animation - cancel it
        ActivitySplitAnimationUtil.cancel();

        super.onStop();    //To change body of overridden methods use File | Settings | File Templates.
    }
}
