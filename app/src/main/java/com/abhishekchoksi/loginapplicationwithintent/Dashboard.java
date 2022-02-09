package com.abhishekchoksi.loginapplicationwithintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends AppCompatActivity {

    TextView txtUserName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        setTitle("Dashboard");
        txtUserName = findViewById(R.id.txtUserName);

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            String name = extras.getString("USER_NAME");
            txtUserName.setText("Welcome " + name);
        }
    }
}