package com.example.layla.habitreboot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class AppUsageActivity extends NavigationActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
}
