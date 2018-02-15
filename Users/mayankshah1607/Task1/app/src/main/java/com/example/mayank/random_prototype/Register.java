package com.example.mayank.random_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.suitebuilder.annotation.MediumTest;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    Button b;
    EditText reg,email,phno,pwd,cnfpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        b = (Button) findViewById(R.id.reg);
        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        register();
                    }
                }
        );

    }
    public void register(){
        reg = (EditText) findViewById(R.id.reg_no);
        email = (EditText) findViewById(R.id.email);
        phno = (EditText) findViewById(R.id.phno);
        pwd = (EditText) findViewById(R.id.pwd);
        cnfpwd = (EditText) findViewById(R.id.cnfPwd);
        String RegNo = reg.getText().toString();
        String Email = email.getText().toString();
        String Phone = phno.getText().toString();
        String Pass = pwd.getText().toString();
        String CPass = cnfpwd.getText().toString();

        if (RegNo.matches("") || Email.matches("") || Phone.matches("") || Pass.matches("") || CPass.matches("")){
            Toast.makeText(this, "Please fill in all the fields.", Toast.LENGTH_SHORT).show();
        }
        else {
            if (Pass.matches(CPass)) {
                Intent login = new Intent(this,MainActivity.class);
                login.putExtra("email",Email);
                login.putExtra("password",Pass);
                login.putExtra("phno",Phone);
                login.putExtra("reg_no_p",RegNo);
                Toast.makeText(this, "Successfully Registered!", Toast.LENGTH_SHORT).show();
                startActivity(login);
                //startActivity(profile);
            }
            else {
                Toast.makeText(this, "Please check your password again!", Toast.LENGTH_SHORT).show();
            }
        }


    }


}
