package com.example.monikagarg.floating;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionsMenu;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);}


    public void editClicked(View v){
        Toast.makeText(getBaseContext(),"lets edit",Toast.LENGTH_LONG).show();
    }
    public void addClicked(View v){
        Intent intent= new Intent("com.example.monikagarg.floating.MainActivity");
        startActivity(intent);
    }



}



       /* f1=(FloatingActionButton)findViewById(R.id.fab_event);
        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent("com.example.monikagarg.floating.Add_new");
                startActivity(intent);*/

