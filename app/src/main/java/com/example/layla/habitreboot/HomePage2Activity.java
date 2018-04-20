package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;


/**
 * Created by mengranwo on 2/28/18.
 */

public class HomePage2Activity  extends NavigationActivity implements TabHost.OnTabChangeListener {

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

        // add tab host listener
        host.setOnTabChangedListener(this);
    }

    @Override
    public void onTabChanged(String tabId) {
        if(tabId.equals("Chart")) {
            Intent i = new Intent(this, HomePage3Activity.class);
            startActivity(i);
            finish();
        }
        else if(tabId.equals("Calendar")) {
            Intent i = new Intent(this, HomePage2Activity.class);
            startActivity(i);
            finish();
        }
    }

}
