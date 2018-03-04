package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TabHost;


/**
 * Created by mengranwo on 2/28/18.
 */

public class HomePage2Activity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);

        TabHost host = findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Calendar");
        spec.setContent(R.id.calendar);
        spec.setIndicator("Calendar");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Chart");
        spec.setContent(R.id.chart);
        spec.setIndicator("Chart");
        host.addTab(spec);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Habit Reboot");

        //设置导航图标要在setSupportActionBar方法之后
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.mipmap.menuicon);

        LinearLayout button = findViewById(R.id.chart);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        // jump into homepage3
        Intent i = new Intent(getApplicationContext(),HomePage3Activity.class);
        startActivity(i);
        setContentView(R.layout.activity_home_page3);
    }

}
