package com.jaewoo.androidopengl.activity;

import android.opengl.GLSurfaceView;

import com.jaewoo.androidopengl.renderer.RendererBase;

/**
 * Created by huisung on 14. 12. 10..
 */
public class OpenGLInitActivity extends OpenGLBaseActivity {

    @Override
    public GLSurfaceView.Renderer getRenderer() {
        return new RendererBase();
    }
}
