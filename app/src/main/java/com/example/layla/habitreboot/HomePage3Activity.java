package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;


/**
 * Created by mengranwo on 2/28/18.
 */

public class HomePage3Activity  extends NavigationActivity implements TabHost.OnTabChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page3);

        TabHost host = findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Chart");
        spec.setContent(R.id.chart);
        spec.setIndicator("Chart");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Calendar");
        spec.setContent(R.id.calendar);
        spec.setIndicator("Calendar");
        host.addTab(spec);

        // render charts
        BarChart bchart = findViewById(R.id.chart1);
        ArrayList<BarEntry> yVals1 = new ArrayList<>();

        for (int i = 0; i < 10 + 1; i++) {
            float val = (float) (Math.random());
            yVals1.add(new BarEntry(i, val));
        }

        BarDataSet set1;
        set1 = new BarDataSet(yVals1, "The year 2018");
        set1.setColors(ColorTemplate.MATERIAL_COLORS);
        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);

        BarData data = new BarData(dataSets);
        data.setValueTextSize(10f);
        data.setBarWidth(0.9f);

        bchart.setTouchEnabled(false);
        bchart.setData(data);
        bchart.setFitBars(true); // make the x-axis fit exactly all bars
        bchart.invalidate(); // refresh

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
