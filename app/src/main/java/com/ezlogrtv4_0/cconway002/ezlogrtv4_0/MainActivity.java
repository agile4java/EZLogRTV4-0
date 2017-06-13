package com.ezlogrtv4_0.cconway002.ezlogrtv4_0;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, Viewgroup container,
                             Bundle savedInstateState){
        //inflate this layout
        View layout=inflater.inflate(R.layout.activity_main, container, false);
        recyclerView= (RecyclerView) findViewById(R.id.main_recycler_view);
        return layout;
    }//end onCreateView
}
