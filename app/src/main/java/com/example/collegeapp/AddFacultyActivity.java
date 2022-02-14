package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AddFacultyActivity extends AppCompatActivity {
    EditText ed1,ed2,ed3,ed4,ed5;
    AppCompatButton b1,b2;
    String getname,getdept,getqual,getmob,getemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_faculty);
        ed1=(EditText) findViewById(R.id.fname);
        ed2=(EditText) findViewById(R.id.dept);
        ed3=(EditText) findViewById(R.id.qual);
        ed4=(EditText) findViewById(R.id.mob);
        ed5=(EditText) findViewById(R.id.email);
        b1=(AppCompatButton) findViewById(R.id.b1);
        b2=(AppCompatButton) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getname=ed1.getText().toString();
                getdept=ed2.getText().toString();
                getqual=ed3.getText().toString();
                getmob=ed4.getText().toString();
                getemail=ed5.getText().toString();
                Toast.makeText(getApplicationContext(), getname, Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getdept,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getqual,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getmob,Toast.LENGTH_SHORT).show();
                Toast.makeText(getApplicationContext(),getemail,Toast.LENGTH_SHORT).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),DashBoardActivity.class);
                startActivity(i);
            }
        });
    }
}