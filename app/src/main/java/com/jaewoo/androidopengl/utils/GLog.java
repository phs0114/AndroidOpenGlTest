/*
 * Copyright (c) 2014. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.jaewoo.androidopengl.utils;

import android.util.Log;

/**
 * Created by Huisung on 14. 12. 10..
 */

public class GLog {
    private static final boolean DEBUG = true;

    public static final void v(String tag, String msg){
        if(!DEBUG){
            return;
        }
        Log.v(tag, msg);
    }

    public static final void d(String tag, String msg){
        if(!DEBUG){
            return;
        }

        Log.d(tag, msg);
    }

    public static final void i(String tag, String msg){
        if(!DEBUG){
            return;
        }

        Log.i(tag, msg);
    }

    public static final void w(String tag, String msg){
        if(!DEBUG){
            return;
        }

        Log.w(tag, msg);
    }

    public static final void e(String tag, String msg){
        if(!DEBUG){
            return;
        }

        Log.e(tag, msg);
    }
}
