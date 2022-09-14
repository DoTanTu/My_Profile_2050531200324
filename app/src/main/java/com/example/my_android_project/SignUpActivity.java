package com.example.my_android_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    Button button;
    EditText userName;
    EditText email;
    EditText password;
    EditText retypePassword;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        userName = (EditText) findViewById(R.id.id_userName_new_account);
        email =  (EditText) findViewById(R.id.id_email_new_account);
        password = (EditText) findViewById(R.id.id_pass_new_account) ;
        retypePassword = (EditText) findViewById(R.id.id_retype_pass_lg) ;
        button = (Button) findViewById(R.id.id_button_new_account);

        textView = (TextView) findViewById(R.id.textView_new_account);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTextView();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = userName.getText().toString();
                String Email = email.getText().toString();
                String PassWord = password.getText().toString();
                String RetypePass = retypePassword.getText().toString();
                if(UserName.equals("")||Email.equals("")||PassWord.equals("")||RetypePass.equals(""))
                    Toast.makeText(SignUpActivity.this,"You need to enter information",Toast.LENGTH_SHORT).show();

                else
                    if(PassWord.equals(RetypePass)==true)
                         setButton();
                    else
                        Toast.makeText(SignUpActivity.this,"password incorrect",Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void setButton(){
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void setTextView() {
        Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
