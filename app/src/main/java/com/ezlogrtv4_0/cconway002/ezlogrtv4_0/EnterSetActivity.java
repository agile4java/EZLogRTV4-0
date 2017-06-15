package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class EnterSetActivity extends AppCompatActivity {



   /* private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }//end switch
            return false;
        }//end onNavigationItemSelected method

    };//end BottomNavigationView.OnNavigationItemSelectedListener
*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_set);

        //declare Spinner for Exercise choice
        Spinner spinner= (Spinner) findViewById(R.id.spinner_exercises);
        //create an ArrayAdapter using the string array Exercises with default spinner layout
        ArrayAdapter<CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.Exercises,
                android.R.layout.simple_spinner_item);
        //Specify the layout to use when the list appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Apply the adapter to the spinner
        spinner.setAdapter(adapter);

//        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

    }//onCreate override method







}//end EnterSetActivityClass
