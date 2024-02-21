package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Logout;
    private CardView notescardview,worklistcardview,categorycardview,previousworkcardview,calendarcardview,mapcardview,homecardview,alarmcardview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notescardview=findViewById(R.id.notes);
        worklistcardview=findViewById(R.id.worklist);
        categorycardview=findViewById(R.id.category);
        previousworkcardview=findViewById(R.id.previouswork);
        calendarcardview=findViewById(R.id.calendar);
        mapcardview=findViewById(R.id.map);
        homecardview=findViewById(R.id.home);
        alarmcardview=findViewById(R.id.alarm);


        notescardview.setOnClickListener(this);
        worklistcardview.setOnClickListener(this);
        categorycardview.setOnClickListener(this);
        previousworkcardview.setOnClickListener(this);
        calendarcardview.setOnClickListener(this);
        mapcardview.setOnClickListener(this);
        homecardview.setOnClickListener(this);
        alarmcardview.setOnClickListener(this);


        Logout=findViewById(R.id.logout);
        Logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentL=new Intent(MainActivity.this, Login.class);
                startActivity(intentL);
                finish();
                Toast.makeText(MainActivity.this,"Successfully Logout",Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onClick(View v) {


         if(v.getId()==R.id.worklist)
        {
            Intent intent = new Intent(MainActivity.this,WorklistActivity.class);
            startActivity(intent);
        }
       else if(v.getId()==R.id.notes)
        {
            Intent intent = new Intent(MainActivity.this,NotesActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.category)
        {
            Intent intent = new Intent(MainActivity.this,CategoryActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.previouswork)
        {
            Intent intent = new Intent(MainActivity.this,PreviousworkActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.calendar)
        {
            Intent intent = new Intent(MainActivity.this,CalendarActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.map)
        {
            Intent intent = new Intent(MainActivity.this,MapActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.home)
        {
            Intent intent = new Intent(MainActivity.this,HomeActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==R.id.alarm)
        {
            Intent intent = new Intent(MainActivity.this,AlarmActivity.class);
            startActivity(intent);
        }

    }
}