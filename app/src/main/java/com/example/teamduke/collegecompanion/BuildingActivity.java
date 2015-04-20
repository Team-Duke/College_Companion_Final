package com.example.teamduke.collegecompanion;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class BuildingActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);
    }

    @SuppressWarnings("UnusedDeclaration")
    public void showPhoto(View view) {


        switch (view.getId()) {

            case R.id.abbey_Building:
                Intent getAbbey = new Intent(this,abbyActivity.class);
                startActivity(getAbbey);
                break;

            case R.id.Bishops_Building:
                Intent getBishops = new Intent(this,BishopsActivity.class);
                startActivity(getBishops);
                break;

            case R.id.cathedral:
                Intent getCathedral = new Intent();
                getCathedral.setClass(this, CatherdralActivity.class);
                break;

            case R.id.Deans:
                Intent getDeans = new Intent();
                getDeans.setClass(this, DeansActivity.class);
                break;

            /*

            case R.id.Gibney:
                setContentView(R.layout.activity_gibney);
                break;

            case R.id.Knights:
                setContentView(R.layout.activity_knights);
                break;

            case R.id.Monks:
                setContentView(R.layout.activity_monks);
                break;

            case R.id.sessions_Restaurant:
                setContentView(R.layout.activity_sessions);
                break;

            case R.id.Temple:
                setContentView(R.layout.activity_temple);
                break; */

        }


    }
}
