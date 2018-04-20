package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HomePage1Activity extends NavigationActivity implements OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page1);

        Button button = findViewById(R.id.button3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        // jump into homepage2
        Intent i = new Intent(this, HomePage2Activity.class);
        startActivity(i);
        setContentView(R.layout.activity_home_page2);
    }
}

