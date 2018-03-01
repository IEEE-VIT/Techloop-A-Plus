package com.example.luci4.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DISPLAY extends AppCompatActivity {

    TextView namedisplay;
    TextView passworddisplay;
    TextView phonedisplay;

    String catchname;
    String catchpassword;
    String catchphone;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        namedisplay = (TextView) findViewById(R.id.nd);
        passworddisplay = (TextView) findViewById(R.id.pd);
        phonedisplay = (TextView) findViewById(R.id.pnd);

        catchname = getIntent().getExtras().getString("key");
        catchpassword = getIntent().getExtras().getString("key1");
        catchphone = getIntent().getExtras().getString("key2");

        namedisplay.setTextSize(25.0f);
        passworddisplay.setTextSize(30.0f);
        phonedisplay.setTextSize(30.0f);

        namedisplay.setText(catchname);
        passworddisplay.setText(catchpassword);
        phonedisplay.setText(catchphone);

    }
}


