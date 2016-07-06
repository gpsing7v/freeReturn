package com.example.gurindersingh.freeingreturn;

import android.app.DatePickerDialog;
import android.os.PersistableBundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.DatePicker;

import butterknife.BindView;
import butterknife.ButterKnife;
import java.util.Calendar;

public class UserAreaActivity extends AppCompatActivity {

    Button date;
    DatePickerDialog datePickerDialog;
    ActionBarDrawerToggle toggle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        date = (Button) findViewById(R.id.date);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar c = Calendar.getInstance();
                int mYear = c.get(Calendar.YEAR); // current year
                int mMonth = c.get(Calendar.MONTH); // current month
                int mDay = c.get(Calendar.DAY_OF_MONTH); // current day
            datePickerDialog = new DatePickerDialog(UserAreaActivity.this,
                    new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    date.setText((monthOfYear + 1) + "/" + dayOfMonth + "/" + year);
                }
            }, mYear, mMonth, mDay);
                datePickerDialog.show();
            }
        });

    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        return toggle.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
//    }

        //        final EditText etName = (EditText) findViewById(R.id.etName);
//        final EditText etEmail = (EditText) findViewById(R.id.etEmail);
//        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
    }
}
