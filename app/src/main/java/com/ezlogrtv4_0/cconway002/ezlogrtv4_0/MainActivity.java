package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //-----------intents for 4 buttons on home screen-take to activities--------------------------

    public void viewStartWorkoutActivity (View view) {
        Intent intent= new Intent(this, WorkoutActivity.class);
    }//end viewEnterSetActivity

    public void viewExerciseListActivity (View view){
        Intent intent=new Intent(this, ExerciseListActivity.class);
        startActivity(intent);
    }//end viewExerciseListActivty

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
