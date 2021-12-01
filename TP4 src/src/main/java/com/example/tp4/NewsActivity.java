package com.example.tp4;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class NewsActivity extends AppCompatActivity {

    public String Login = "";
    public String Password = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Button nButton = (Button) findViewById(R.id.button_news);
        Button dButton = (Button) findViewById(R.id.button_details);
        Intent intent = getIntent();

        boolean hasLogin = intent.hasExtra("login");
        boolean hasPwd = intent.hasExtra("Password");
        if(hasLogin)
            Login = intent.getStringExtra("login");
        if(hasPwd)
            Password = intent.getStringExtra("Password");

        setTitle(getLocalClassName() + " : " + Login);


        nButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String url = "https://news.google.com/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        dButton.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finishAffinity();
        System.exit(0);
    }

}
