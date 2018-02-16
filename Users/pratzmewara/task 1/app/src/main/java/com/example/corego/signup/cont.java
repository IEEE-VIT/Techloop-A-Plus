package com.example.corego.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class cont extends AppCompatActivity {

    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    Button Quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cont);
        t1=(TextView) findViewById(R.id.text);
        t2=(TextView) findViewById(R.id.text2);
        t3=(TextView) findViewById(R.id.textview);
        t4=(TextView) findViewById(R.id.textview2);


        Intent i=getIntent();
        t1.setText(i.getStringExtra("user"));
        t2.setText(i.getStringExtra("email"));
        t3.setText(i.getStringExtra("reg"));
        t4.setText(i.getStringExtra("mob"));

        Quit = (Button)findViewById(R.id.button2);

        Quit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                finish();

            }
        });


    }
}
