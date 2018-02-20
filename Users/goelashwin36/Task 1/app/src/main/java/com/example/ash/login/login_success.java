package com.example.ash.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class login_success extends AppCompatActivity {
TextView t1;
TextView t2;
TextView t3;
String catched1;
String catched2;
String catched3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_success);

        catched1=getIntent().getExtras().getString("name_id");
        catched2=getIntent().getExtras().getString("mail_id");
        catched3=getIntent().getExtras().getString("pass_id");
        t1.setText(catched1);
        t2.setText(catched2);
        t3.setText(catched3);

    }
}
