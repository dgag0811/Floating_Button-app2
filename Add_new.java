package com.example.monikagarg.floating;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Add_new extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void AddEvent(View v){
        android.app.FragmentManager fm= getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        NewEvent f1= new NewEvent();
        ft.replace(R.id.contain, f1);
        ft.commit();
    }

    public void AddTimeTableEntry(View v) {
        android.app.FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        NewMenuEntry f2 = new NewMenuEntry();
        ft.replace(R.id.contain, f2);
        ft.commit();
    }

    public void AddMenuEntry(View v){
    android.app.FragmentManager fm=getFragmentManager();
    FragmentTransaction ft=fm.beginTransaction();
    NewTimeTableEntry f3= new NewTimeTableEntry();
    ft.replace(R.id.contain, f3);
    ft.commit();




    }

}
