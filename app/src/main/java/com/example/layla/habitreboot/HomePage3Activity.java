package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
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

public class HomePage3Activity  extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page3);

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
        toolbar.setTitle("Habit Reboot3");

        //设置导航图标要在setSupportActionBar方法之后
//        setSupportActionBar(toolbar);
//        toolbar.setNavigationIcon(R.mipmap.menuicon);

        // render charts
        setContentView(R.layout.activity_home_page3);
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
