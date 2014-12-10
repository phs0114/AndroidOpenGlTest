/*
 * Copyright (c) 2014. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.jaewoo.androidopengl.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.jaewoo.androidopengl.R;
import com.jaewoo.androidopengl.activity.OpenGLInitActivity;
import com.jaewoo.androidopengl.activity.OpenGLSquareActivity;
import com.jaewoo.androidopengl.activity.OpenGLTriangleActivity;

/**
 * Created by Huisung on 14. 12. 10..
 */
public class AdapterOpenGL extends ArrayAdapter<AdapterOpenGL.ITEM>{
    public enum ITEM{
        INIT("Init OpenGL", OpenGLInitActivity.class),
        TRIANGLE("Draw triangle by OpenGL", OpenGLTriangleActivity.class),
        SQUARE("Draw square by OpenGL", OpenGLSquareActivity.class);

        private String mDisplay;
        private Class mActivityClass;

        ITEM(String display, Class activity){
            mDisplay = display;
            mActivityClass = activity;
        }

        public String getDisplay(){
            return mDisplay;
        }

        public Class getActivityClass(){
            return mActivityClass;
        }
    }

    public AdapterOpenGL(Context context) {
        super(context, R.layout.item_opengl_list);
        for(ITEM menu : ITEM.values()){
            add(menu);
        }
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = super.getView(position, convertView, parent);
        ITEM item = getItem(position);

        if(view != null && item != null){
            TextView tvItem = (TextView)view.findViewById(R.id.tv_opengl_menu);
            if(tvItem != null){
                tvItem.setText(item.getDisplay());
            }
        }
        return view;
    }
}
