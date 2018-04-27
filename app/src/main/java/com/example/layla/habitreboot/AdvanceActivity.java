package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View;

/**
 * Created by raoliang on 4/19/18.
 */

public class AdvanceActivity extends NavigationActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_health_plan);

        Button button = findViewById(R.id.ImageButton01);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        // jump into advance plan specification
        Intent i = new Intent(this, Advance2Activity.class);
        startActivity(i);
        finish();
    }
}