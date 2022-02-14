package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class StudentSearchActivity extends AppCompatActivity {
    EditText ed1;
    AppCompatButton b1,b2;
    String getadmno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_search);
        ed1=(EditText) findViewById(R.id.admno);
        b1=(AppCompatButton) findViewById(R.id.b1);
        b2=(AppCompatButton) findViewById(R.id.b2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getadmno=ed1.getText().toString();
                Toast.makeText(getApplicationContext(), getadmno, Toast.LENGTH_SHORT).show();
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