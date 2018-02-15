package com.example.mayank.random_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Profile extends AppCompatActivity {
    TextView email,reg,ph,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getData();
    }

    public void getData(){
        Intent data = getIntent();
        email = (TextView) findViewById(R.id.textEmail);
        reg = (TextView) findViewById(R.id.textReg);
        ph = (TextView) findViewById(R.id.textPh);
        pass = (TextView) findViewById(R.id.textPass);

        email.setText(data.getStringExtra("profile_email"));
        reg.setText(data.getStringExtra("profile_reg"));
        ph.setText(data.getStringExtra("profile_ph"));
        pass.setText(data.getStringExtra("profile_pass"));
    }

    public void logout(View view) {
        Intent login = new Intent(this,MainActivity.class);
        Toast.makeText(this, "Successfully Logged Out!", Toast.LENGTH_SHORT).show();
        startActivity(login);

    }
}
