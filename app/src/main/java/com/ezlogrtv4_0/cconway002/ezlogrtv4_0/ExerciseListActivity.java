package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class ExerciseListActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_list);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


    }//end opCreate
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_toolbar_actions, menu);
        return true;
    }//end OnCreateOptionsMenu

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.toolbar_select_date:
                return true;
            case R.id.toolbar_exercise_list:
                startActivity(new Intent(this, ExerciseListActivity.class));
                return true;
            case R.id.toolbar_last_workout:
                startActivity(new Intent(this, LastWorkoutActivity.class));
                return true;
            case R.id.toolbar_previous_workouts:
                startActivity(new Intent(this, PreviousWorkoutsActivity.class));
                return true;
            case R.id.toolbar_start_workout:
                startActivity(new Intent(this, WorkoutActivity.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }//end switch
    }//end onOptionsItemSelected
}
