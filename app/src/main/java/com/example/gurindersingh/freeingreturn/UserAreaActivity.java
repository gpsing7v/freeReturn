package com.example.gurindersingh.freeingreturn;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
//
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
//
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//
        return toggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
//    }

        //        final EditText etName = (EditText) findViewById(R.id.etName);
//        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
//        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
    }
}
