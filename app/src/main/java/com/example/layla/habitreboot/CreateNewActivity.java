package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

/**
 * Created by mengranwo on 2/28/18.
 */

public class CreateNewActivity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_habit);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Habit Reboot");

        //设置导航图标要在setSupportActionBar方法之后
//        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.mipmap.menuicon);
//
//        Button button = findViewById(R.id.button2);
//        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent i = new Intent(getApplicationContext(),AppUsageActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_app_usage);
    }

}
