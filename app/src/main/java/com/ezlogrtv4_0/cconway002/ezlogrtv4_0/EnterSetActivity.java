package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class EnterSetActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener {

    private Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_set);
    //------------------------------tutorials point spinner example--------------------------------
    //Spinner Element
    AppCompatSpinner exerciseSpinner = new AppCompatSpinner(this, R.id.spinner_exercises);

    //set spinner click listener
    exerciseSpinner.setOnItemSelectedListener(this);

    //Spinner Dropdown Elements
    List<String> categories = new ArrayList<String>();
    categories.add("Automobile");
    categories.add("Business Services");
    categories.add("Computers");
    categories.add("Education");
    categories.add("Personal");
    categories.add("Travel");


    //create adapter for spinner
    ArrayAdapter<String> exerciseAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,
                categories);
        exerciseSpinner.setAdapter(exerciseAdapter);

    exerciseSpinner.setAdapter(exerciseAdapter);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


    }//end onCreate
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
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String exerciseSelected = parent.getItemAtPosition(position).toString();
        TextView selectedExercise = (TextView) findViewById(R.id.selected_exercise);
        selectedExercise.setText(exerciseSelected);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}//end EnterSetActivityClass
