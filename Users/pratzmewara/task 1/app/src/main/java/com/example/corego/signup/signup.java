package com.example.corego.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    EditText edtu;
    EditText edte;
    EditText edtm;
    EditText edtr;
    EditText edtp;
Button sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        edtu=(EditText) findViewById(R.id.user);
        edte=(EditText) findViewById(R.id.email);
        edtm=(EditText) findViewById(R.id.mob);
        edtr=(EditText) findViewById(R.id.reg);
        edtp=(EditText) findViewById(R.id.pass);
        sig=(Button) findViewById(R.id.butt);
        sig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i=0;

                String em=edte.getText().toString();
                String mo=edtm.getText().toString();
                String re=edtr.getText().toString();
                String pa=edtp.getText().toString();
                String us=edtu.getText().toString();

                if(em=="")
                {
                    i++;
                    Toast.makeText(signup.this,"EMAIL IS MISSING",Toast.LENGTH_SHORT).show();
                }
                else if(mo=="")
                {
                    i++;
                    Toast.makeText(signup.this,"MOBILE NUMBER IS MISSING",Toast.LENGTH_SHORT).show();
                }

               else if(re=="")
                {
                    i++;
                    Toast.makeText(signup.this,"REGISTRATION NUMBER IS MISSING",Toast.LENGTH_SHORT).show();
                }

                else if(us=="")
                {
                    i++;
                    Toast.makeText(signup.this,"USERNAME IS MISSING",Toast.LENGTH_SHORT).show();
                }


                if(i==0) {
                    String emaill = String.valueOf(em);
                    String mobill = String.valueOf(mo);
                    String regg = String.valueOf(re);
                    String passw = String.valueOf(pa);
                    String usern = String.valueOf(us);
                    Intent intent = new Intent(signup.this, cont.class);
                    Toast.makeText(signup.this,"SUCCESFULL SIGN UP",Toast.LENGTH_SHORT).show();
                    intent.putExtra("user", usern);
                    intent.putExtra("email", emaill);
                    intent.putExtra("reg", regg);
                    intent.putExtra("mob", mobill);
                    startActivity(intent);
                }
            }
        });


    }
}
