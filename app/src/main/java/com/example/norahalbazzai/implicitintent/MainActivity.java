package com.example.norahalbazzai.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openWebSite (View v)
    {
        // To read data ntered by the user in input field
        EditText ed = (EditText) findViewById(R.id.httpLinkInp);
        String url = "http://" + ed.getText().toString();

        // To ask System to open website

        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));

        // OR  Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));

        startActivity(i);

    }
}
