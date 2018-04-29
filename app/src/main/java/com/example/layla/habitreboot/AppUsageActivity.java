package com.example.layla.habitreboot;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;

import java.util.ArrayList;

public class AppUsageActivity extends NavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int VERY_LIGHT_RED = 0xFFF5B7B1;
        int VERY_MIDDLE_RED = 0xFFE74C3C;
        int VERY_DARK_RED = 0xFF943126;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_usage);

        TabHost host = findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Day");
        spec.setContent(R.id.Day);
        spec.setIndicator("Day");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Week");
        spec.setContent(R.id.Week);
        spec.setIndicator("Week");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Month");
        spec.setContent(R.id.Month);
        spec.setIndicator("Month");
        host.addTab(spec);

        BarChart bchart = findViewById(R.id.chart1);
        ArrayList<BarEntry> yVals1 = new ArrayList<>();
        yVals1.add(new BarEntry(0, 20));

        BarDataSet set1;
        set1 = new BarDataSet(yVals1, "Facebook");
        set1.setColor(VERY_LIGHT_RED);

        ArrayList<BarEntry> yVals2 = new ArrayList<>();
        yVals2.add(new BarEntry(0, 12));

        BarDataSet set2;
        set2 = new BarDataSet(yVals2, "Instagram");
        set2.setColor(VERY_MIDDLE_RED);

        ArrayList<BarEntry> yVals3 = new ArrayList<>();
        yVals3.add(new BarEntry(0, 8));

        BarDataSet set3;
        set3 = new BarDataSet(yVals3, "Snapchat");
        set3.setColor(VERY_DARK_RED);

        ArrayList<IBarDataSet> dataSets = new ArrayList<>();
        dataSets.add(set1);
        dataSets.add(set2);
        dataSets.add(set3);

        BarData data = new BarData(dataSets);
        data.setValueTextSize(10f);
        data.setBarWidth(2.7f);

        bchart.setTouchEnabled(false);
        bchart.setData(data);
        bchart.setFitBars(true); // make the x-axis fit exactly all bars
        bchart.invalidate(); // refresh

        Legend l = bchart.getLegend();
        l.setFormSize(10f); // set the size of the legend forms/shapes
        l.setForm(Legend.LegendForm.CIRCLE); // set what type of form/shape should be used
        l.setTextSize(15f);
        l.setTextColor(Color.BLACK);
        l.setXEntrySpace(5f); // set the space between the legend entries on the x-axis
        l.setYEntrySpace(5f); // set the space between the legend entries on the y-axis

    }
}
