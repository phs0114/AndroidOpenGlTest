package com.jaewoo.androidopengl.activity;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

/**
 * Created by huisung on 14. 12. 10..
 */
public abstract class OpenGLBaseActivity extends Activity {
    protected GLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLSurfaceView = new GLSurfaceView(this);
        setContentView(mGLSurfaceView);

        mGLSurfaceView.setRenderer(getRenderer());
    }

    public abstract GLSurfaceView.Renderer getRenderer();

}
