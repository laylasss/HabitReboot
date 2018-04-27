package com.example.layla.habitreboot;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public abstract class NavigationActivity extends AppCompatActivity
        implements MenuItem.OnMenuItemClickListener, View.OnClickListener {
    //This is the frame layout to keep your content view
    private FrameLayout view_stub;
    private DrawerLayout drawer_layout;
    private Toolbar toolbar;
    private NavigationView navigation_view;
    private ActionBarDrawerToggle toggle;
    private Menu drawer_menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_navigation);

        view_stub = findViewById(R.id.view_stub);
        navigation_view = findViewById(R.id.nav_view);
        drawer_layout = findViewById(R.id.drawer_layout);
        toolbar = findViewById(R.id.toolbar);
        toggle = new ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer_layout.addDrawerListener(toggle);

        drawer_menu = navigation_view.getMenu();
        for(int i = 0; i < drawer_menu.size(); i++) {
            // add item select listener
            drawer_menu.getItem(i).setOnMenuItemClickListener(this);
        }

    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    /* Override all setContentView methods to put the content view to the FrameLayout view_stub
     * so that, we can make other activity implementations looks like normal activity subclasses.
     */
    @Override
    public void setContentView(int layoutResID) {
        if (view_stub != null) {
            LayoutInflater inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            View stubView = inflater.inflate(layoutResID, view_stub, false);
            view_stub.addView(stubView, lp);
        }
    }

    @Override
    public void setContentView(View view) {
        if (view_stub != null) {
            ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT);
            view_stub.addView(view, lp);
        }
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        if (view_stub != null) {
            view_stub.addView(view, params);
        }
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        Intent i = new Intent(getApplicationContext(),AppUsageActivity.class);
        startActivity(i);
        setContentView(R.layout.activity_app_usage);
    }

    @Override
    public void onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        Intent i;
        switch (item.getItemId()) {
            case R.id.nav_home:
                // handle it
                Log.d("myTag", "This is my nav_home");
                i = new Intent(this, HomePage1Activity.class);
                startActivity(i);
                finish();
                return true;
            case R.id.nav_list:
                // do whatever
                Log.d("myTag", "This is my nav_list");
                i = new Intent(this, TodolistActivity.class);
                startActivity(i);
                finish();
                return true;
            case R.id.nav_usage:
                Log.d("myTag", "This is my nav_usage");
                i = new Intent(this, AppUsageActivity.class);
                startActivity(i);
                finish();
                return true;
            case R.id.nav_plan:
                Log.d("myTag", "This is my nav_plan");
                i = new Intent(this, AdvanceActivity.class);
                startActivity(i);
                finish();
                return true;
            case R.id.nav_setting:
                Log.d("myTag", "This is my nav_setting");
                i = new Intent(this, ProfileActivity.class);
                startActivity(i);
                finish();
                return true;
            case R.id.nav_new_habit:
                Log.d("myTag", "This is my nav_new_habit");
                i = new Intent(this, CreateNewActivity.class);
                startActivity(i);
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
