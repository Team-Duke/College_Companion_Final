package com.example.teamduke.collegecompanion;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void Open_moodle(View view) {
        Intent getMoodleActivity = new Intent(this,MoodleActivity.class);

        final int result = 1;
        getMoodleActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getMoodleActivity, result);

    }

    public void open_Webmail(View view) {
        Intent getWebmailActivity = new Intent(this,WebmailActivity.class);

        final int result = 1;
        getWebmailActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getWebmailActivity, result);
    }
    public void Open_Library(View view) {
        Intent getLibraryActivity = new Intent(this,LibraryActivity.class);

        final int result = 1;
        getLibraryActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getLibraryActivity, result);
    }

    public void Open_Buildings(View view) {
        Intent getBuildingActivity = new Intent(this,BuildingActivity.class);

        final int result = 1;
        getBuildingActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getBuildingActivity, result);
    }

    public void Open_Registration(View view) {
        Intent getRegistrationActivity = new Intent(this,RegistrationActivity.class);

        final int result = 1;
        getRegistrationActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getRegistrationActivity, result);
    }

    public void Open_StudentCard(View view) {
        Intent getStudentActivity = new Intent(this,StudentCardActivity.class);

        final int result = 1;
        getStudentActivity.putExtra("callingActivity", "MainActivity");
        startActivityForResult(getStudentActivity, result);
    }




}
