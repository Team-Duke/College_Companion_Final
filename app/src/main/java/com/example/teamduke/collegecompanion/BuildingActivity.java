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



            case R.id.Gibney:
                Intent getGibney = new Intent();
                getGibney.setClass(this, gibneyActivity.class);
                break;

            case R.id.Knights:
                Intent getKnights = new Intent();
                getKnights.setClass(this, KnightsActivity.class);
                break;

            case R.id.Monks:
                Intent getMonks = new Intent();
                getMonks.setClass(this, MonksActivity.class);
                break;

            case R.id.sessions_Restaurant:
                Intent getSessions = new Intent();
                getSessions.setClass(this, SessionsActivity.class);
                break;

            case R.id.Temple:
                Intent getTemple = new Intent();
                getTemple.setClass(this, TempleActivity.class);
                break;

        }


    }
}
