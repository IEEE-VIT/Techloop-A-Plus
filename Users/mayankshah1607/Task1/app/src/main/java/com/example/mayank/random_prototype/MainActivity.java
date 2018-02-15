package com.example.mayank.random_prototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    EditText email_field,pass_field;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click();
    }
    public void click(){
        button = (Button) findViewById(R.id.btn_reg);
        button.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent a = new Intent("com.example.mayank.random_prototype.Register");
                        startActivity(a);
                    }
                }
        );
    }
    public void login(View view){
        Intent data = getIntent();
        String email = data.getStringExtra("email");
        String pass = data.getStringExtra("password");
        String reg = data.getStringExtra("reg_no_p");
        String ph = data.getStringExtra("phno");
        email_field = (EditText) findViewById(R.id.l_email);
        pass_field = (EditText) findViewById(R.id.l_password);
        String Email = email_field.getText().toString();
        String Pass = pass_field.getText().toString();
        if (Pass.equals(pass) && Email.equals(email)){
            Intent profile = new Intent(this,Profile.class);
            profile.putExtra("profile_email",email);
            profile.putExtra("profile_pass",pass);
            profile.putExtra("profile_reg",reg);
            profile.putExtra("profile_ph",ph);
            startActivity(profile);

        }
        else {
            Toast.makeText(this, "Please check your password.", Toast.LENGTH_SHORT).show();
        }
    }
}
