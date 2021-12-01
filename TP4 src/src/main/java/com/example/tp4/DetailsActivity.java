package com.example.tp4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tp4.R;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        NewsListApplication app = (NewsListApplication) getApplicationContext();
        setTitle(getLocalClassName() + " : " + app.login);
        Button bButton = (Button) findViewById(R.id.button_bruh);
        bButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

}