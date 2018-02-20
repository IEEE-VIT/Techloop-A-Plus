package com.example.ash.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPageActivity extends AppCompatActivity {
Button button;
EditText t1,t2,t3;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button= findViewById(R.id.button2);
        t1=findViewById(R.id.name_id);
        t2=findViewById(R.id.mail_id);
        t3=findViewById(R.id.pass_id);}

            public void onClick(View view){
                Intent intent=new Intent(this,login_success.class);
                String username= t1.getText().toString();
                String usermail= t2.getText().toString();
                String userpass= t3.getText().toString();
                intent.putExtra("name_id",username);
                intent.putExtra("mail_id",usermail);
                intent.putExtra("pass_id",userpass);

                startActivity(intent);
            }
        }

