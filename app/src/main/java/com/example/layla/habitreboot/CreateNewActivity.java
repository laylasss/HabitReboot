package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mengranwo on 2/28/18.
 */

public class CreateNewActivity extends NavigationActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_activity_navigation_1);

        //Health
        Button button = findViewById(R.id.ImageButton02);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(getApplicationContext(), CreateActivityNavigation1.class);
                startActivity(i);
                finish();
            }
        });

        //Write my own
        Button button1 = findViewById(R.id.ImageButton01);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Intent i = new Intent(getApplicationContext(), CreateGameActivityDaily.class);
                startActivity(i);
                finish();
            }
        });
    }



}
