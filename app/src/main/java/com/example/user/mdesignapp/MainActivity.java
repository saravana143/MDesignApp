package com.example.user.mdesignapp;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private CoordinatorLayout coordinatorLayout;
    private Toolbar toolbar;
    private AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.app_Toolbar);
        setupToolbar();
        setSupportActionBar(toolbar);
    }

    private void setupToolbar() {
        setTheme(R.style.AppTheme);
        toolbar.setTitle("MDesignerApp");
        toolbar.setTitleTextAppearance(this, R.style.AppTheme);
        toolbar.setLogo(R.drawable.ic_launcher);
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.share) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
