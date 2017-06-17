package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       /* Toolbar mainToolbar = (Toolbar) findViewById(R.id.main_toolbar);
        setSupportActionBar(mainToolbar);*/


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


    //-----------intents for 4 buttons on home screen-take to activities--------------------------


    public void viewExerciseListActivity (View view){
        Intent intent=new Intent(this, ExerciseListActivity.class);
        startActivity(intent);
    }//end viewExerciseListActivty

    public void viewWorkoutActivity(View view){
        Intent intent = new Intent(this, WorkoutActivity.class);
        startActivity(intent);
    }

    public void viewLastWorkoutAtivity (View view){
        Intent intent=new Intent(this, LastWorkoutActivity.class);
        startActivity(intent);
    }//end viewLastWorkoutActivity

    public void viewPreviousWorkoutsActivity (View view){
        Intent intent=new Intent(this, PreviousWorkoutsActivity.class);
        startActivity(intent);
    }//end viewPreviousWorkoutsActivity method


    //------------------------End of Intents-----------------------------------------------------


    //-----------------Attempt to AutoSizeText in buttons-not working yet------------------------
   /* @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Button button = (Button) findViewById(R.id.button);
        int text_height = button.getHeight()/2;
        button.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_height);
    }*/
}
