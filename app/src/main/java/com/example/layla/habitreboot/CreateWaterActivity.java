package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by raoliang on 4/28/18.
 */

public class CreateWaterActivity extends NavigationActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_habit_water);
    }

}
