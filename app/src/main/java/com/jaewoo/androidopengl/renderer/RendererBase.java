/*
 * Copyright (c) 2014. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.jaewoo.androidopengl.renderer;

import android.opengl.GLSurfaceView;
import android.opengl.GLU;

import com.jaewoo.androidopengl.data.DataOpenGLInit;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by Huisung on 14. 12. 10..
 */
public class RendererBase implements GLSurfaceView.Renderer {
    private static final String TAG = "RendererBase";
    private DataOpenGLInit mData;

    public RendererBase(){
        this(new DataOpenGLInit());
    }

    public RendererBase(DataOpenGLInit initData){
        mData = initData;
    }

    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        gl.glShadeModel(GL10.GL_SMOOTH);
        gl.glClearColor(mData.getRed(), mData.getGreen(), mData.getBlue(), 1F);
        gl.glClearDepthf(1.0f);

        gl.glEnable(GL10.GL_DEPTH_TEST);
        gl.glDepthFunc(GL10.GL_LEQUAL);

        gl.glHint(GL10.GL_PERSPECTIVE_CORRECTION_HINT, GL10.GL_NICEST);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL10.GL_PROJECTION);
        gl.glLoadIdentity();

        GLU.gluPerspective(gl, mData.getStartAngle(), (float) width / height, mData.getStartDepth(), mData.getEndDepth());

        gl.glMatrixMode(GL10.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        gl.glClear(GL10.GL_COLOR_BUFFER_BIT | GL10.GL_DEPTH_BUFFER_BIT);
        gl.glLoadIdentity();
        gl.glTranslatef(0.0f, 0.0f, -6.0f);
    }
}
