package com.example.luci4.enigma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText password;
    EditText phoneno;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.Name);
        password = (EditText) findViewById(R.id.Password);
        phoneno = (EditText) findViewById(R.id.Phoneno);

        btn = (Button) findViewById(R.id.btn);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                String nameString = name.getText().toString();
                String passwordString = password.getText().toString();
                String phonenoString = phoneno.getText().toString();

                Intent intent = new Intent(MainActivity.this,DISPLAY.class);
                intent.putExtra("key", nameString);
                intent.putExtra("key1", passwordString);
                intent.putExtra("key2", phonenoString);
                startActivity(intent);
            }
        });



    }
}
