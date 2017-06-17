package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WorkoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
    }

    public void viewEnterSetActivity(View view){
        Intent intent = new Intent(this, EnterSetActivity.class);
        startActivity(intent);
    }//end view EnterSetActivity
}