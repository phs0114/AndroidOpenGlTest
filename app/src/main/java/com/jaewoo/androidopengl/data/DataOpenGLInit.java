/*
 * Copyright (c) 2014. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.jaewoo.androidopengl.data;

import android.graphics.Color;

/**
 * Created by Huisung on 14. 12. 10..
 */

public class DataOpenGLInit {
    private float mColorRed = 0.5F;
    private float mColorGreen = 0.5F;
    private float mColorBlue = 0.5F;
    private float mPosZStart = 1F;
    private float mPosZEnd = 30F;
    private float mStartAngle = 45F;

    public void setBackgroudnColor(int color){
        mColorRed = Math.round((Color.red(color) / 255F) * 100F) / 100F;
        mColorGreen = Math.round((Color.green(color) / 255F) * 100F) / 100F;
        mColorBlue = Math.round((Color.blue(color) / 255F) * 100F) / 100F;
    }

    public float getRed(){
        return mColorRed;
    }

    public float getGreen(){
        return mColorGreen;
    }

    public float getBlue(){
        return mColorBlue;
    }

    public void displayDepth(float startPos, float endPos){
        mPosZStart = startPos;
        mPosZEnd = endPos;
    }

    public float getStartDepth(){
        return mPosZStart;
    }

    public float getEndDepth(){
        return mPosZEnd;
    }

    public void setStartAngle(float angle){
        mStartAngle = angle;
    }

    public float getStartAngle(){
        return mStartAngle;
    }
}
