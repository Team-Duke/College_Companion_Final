package com.example.teamduke.collegecompanion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    public void Log_in(View view) {
        EditText username = (EditText) findViewById(R.id.editTextUserName);
        EditText password = (EditText) findViewById(R.id.editTextPassword);

        Toast toast;

        if (username.getText().toString().equals("255051") && password.getText().toString().equals("password")) {

            Intent getMainActivity = new Intent(this, MainActivity.class);
            final int result = 1;
            username.setText("255051");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);

            toast = Toast.makeText(this, "Login success", Toast.LENGTH_SHORT);
            toast.show();

        }

        if (username.getText().toString().equals("282889") && password.getText().toString().equals("password")) {

            Intent getMainActivity = new Intent(this, MainActivity.class);
            final int result = 1;
            username.setText("282889");
            getMainActivity.putExtra("callingActivity", "MainActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);

            toast = Toast.makeText(this, "Login success", Toast.LENGTH_SHORT);
            toast.show();


        }
        if (username.getText().toString().equals("284133") && password.getText().toString().equals("password")) {

            Intent getMainActivity = new Intent(this, MainActivity.class);
            final int result = 1;
            username.setText("284133");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);

            toast = Toast.makeText(this, "Login success", Toast.LENGTH_SHORT);
            toast.show();


        }
        if (username.getText().toString().equals("290776") && password.getText().toString().equals("password")) {

            Intent getMainActivity = new Intent(this, MainActivity.class);
            final int result = 1;
            username.setText("290776");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);

            toast = Toast.makeText(this, "Login success", Toast.LENGTH_SHORT);
            toast.show();


        }
        if (username.getText().toString().equals("290959") && password.getText().toString().equals("password")) {

            Intent getMainActivity = new Intent(this, MainActivity.class);
            final int result = 1;
            username.setText("290959");
            getMainActivity.putExtra("MainActivity", "callingActivity");
            SharedPreferences data = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
            data.edit().putString("username", username.getText().toString()).commit();
            startActivityForResult(getMainActivity, result);

            toast = Toast.makeText(this, "Login success", Toast.LENGTH_SHORT);
            toast.show();


        }
        else
        {
            if (!password.getText().toString().equals("password")) {
                toast = Toast.makeText(this, "Incorrect please try again", Toast.LENGTH_SHORT);
                toast.show();
            }

        }

    }
}
