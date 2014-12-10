/*
 * Copyright (c) 2014. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.jaewoo.androidopengl.activity;

import android.opengl.GLSurfaceView;

import com.jaewoo.androidopengl.renderer.RendererBase;

/**
 * Created by Huisung on 14. 12. 10..
 */
public class OpenGLSquareActivity extends OpenGLBaseActivity{
    @Override
    public GLSurfaceView.Renderer getRenderer() {
        return new SquareRenderer();
    }

    private class SquareRenderer extends RendererBase{

    }
}
