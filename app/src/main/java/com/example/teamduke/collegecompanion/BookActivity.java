package com.example.teamduke.collegecompanion;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class BookActivity extends ActionBarActivity {

    TextView bookActivityTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        bookActivityTitle = (TextView) findViewById(R.id.bookTitleTextView);


    }

}
