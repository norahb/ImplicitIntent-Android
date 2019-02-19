package com.example.norahalbazzai.implicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class webBrowser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_browser);

        Toast.makeText(getApplicationContext(),"Web Browser App",Toast.LENGTH_LONG).show();
    }
}
