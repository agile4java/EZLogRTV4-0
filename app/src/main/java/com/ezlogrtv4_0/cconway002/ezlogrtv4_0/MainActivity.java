package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import static android.R.attr.button;
import static android.R.id.button1;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



   /* @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        Button button = (Button) findViewById(R.id.button);
        int text_height = button.getHeight()/2;
        button.setTextSize(TypedValue.COMPLEX_UNIT_PX, text_height);
    }*/
}
