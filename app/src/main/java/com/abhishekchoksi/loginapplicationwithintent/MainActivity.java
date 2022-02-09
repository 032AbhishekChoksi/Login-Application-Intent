package com.abhishekchoksi.loginapplicationwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextUserName,editTextPassword;
    Button btnLogin;
    TextView textMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Login Form");
        editTextUserName = findViewById(R.id.editTextUserName);
        editTextPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);
        textMessage = findViewById(R.id.textMessage);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = editTextUserName.getText().toString();
                String password = editTextPassword.getText().toString();

                if(username.equals("Admin") && password.equals("123")){
                    Intent intent = new Intent(view.getContext(),Dashboard.class);
                    intent.putExtra("USER_NAME",username);
                    startActivity(intent);
                }else{
                    textMessage.setText("Invalid UserName and Password!");
                }
            }
        });
    }
}