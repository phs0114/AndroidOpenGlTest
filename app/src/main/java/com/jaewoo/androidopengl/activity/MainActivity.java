package com.jaewoo.androidopengl.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.jaewoo.androidopengl.R;
import com.jaewoo.androidopengl.adapter.AdapterOpenGL;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnItemClick;

public class MainActivity extends Activity{
    @InjectView(R.id.main_list_menu)
    protected ListView mMainListView;

    private AdapterOpenGL mAdapterMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        mAdapterMenu = new AdapterOpenGL(this);
        mMainListView.setAdapter(mAdapterMenu);
    }

    @OnItemClick(R.id.main_list_menu)
    public void onClickMenu(int position){
        AdapterOpenGL.ITEM item = mAdapterMenu.getItem(position);
        if(item != null){
            Intent intent = new Intent(this,item.getActivityClass());
            startActivity(intent);
        }
    }
}
