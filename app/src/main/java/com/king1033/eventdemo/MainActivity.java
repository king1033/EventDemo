package com.king1033.eventdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * 实现ListView的item的侧滑效果
 */
public class MainActivity extends AppCompatActivity {

    private CustomListView mListView;
    private MyAapter myAapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (CustomListView) findViewById(R.id.custom_list_view);
        myAapter = new MyAapter();
        mListView.setAdapter(myAapter);
    }

    private class MyAapter extends BaseAdapter{
        @Override
        public int getCount() {
            return 20;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;
            if(view == null){
                view = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_view,parent,false);
            }
            return view;
        }
    }
}
