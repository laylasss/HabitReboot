package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by raoliang on 4/28/18.
 */

public class CreateGameActivityDaily extends NavigationActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_habit_daily);

        Button button = findViewById(R.id.radioButton4);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        // jump into homepage2
        Intent i = new Intent(this, CreateGameActivityWeekly.class);
        startActivity(i);
        finish();
    }
}
