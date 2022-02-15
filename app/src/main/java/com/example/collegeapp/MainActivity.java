package com.example.collegeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ed1,ed2;
    AppCompatButton b1,b2;
    String getemail,getpass,prefvalue;
    SharedPreferences mypreference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mypreference=getSharedPreferences("login",MODE_PRIVATE);
        ed1=(EditText) findViewById(R.id.email);
        ed2=(EditText) findViewById(R.id.pass);
        b1=(AppCompatButton) findViewById(R.id.b1);
        b2=(AppCompatButton) findViewById(R.id.b2);
        prefvalue=mypreference.getString("email",null);
        if(prefvalue!=null)
        {

            Intent i=new Intent(getApplicationContext(),DashBoardActivity.class);
            startActivity(i);


        }
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getemail=ed1.getText().toString();
                getpass=ed2.getText().toString();
                if(getemail.equals("admin@email.com")&&getpass.equals("12345"))
                {
                    SharedPreferences.Editor myedit=mypreference.edit();
                    myedit.putString("email",getemail);
                    myedit.commit();
                    Intent i=new Intent(getApplicationContext(),DashBoardActivity.class);
                    startActivity(i);
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(i);

            }
        });
    }
}