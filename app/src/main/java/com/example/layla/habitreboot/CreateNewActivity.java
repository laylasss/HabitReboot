package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by mengranwo on 2/28/18.
 */

public class CreateNewActivity  extends NavigationActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_habit);

        Button button = findViewById(R.id.save);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent i = new Intent(getApplicationContext(), HomePage1Activity.class);
        startActivity(i);
        finish();
    }

}
