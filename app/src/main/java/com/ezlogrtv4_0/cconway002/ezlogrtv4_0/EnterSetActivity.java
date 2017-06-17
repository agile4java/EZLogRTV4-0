package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatSpinner;
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


    }//onCreate override method

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
