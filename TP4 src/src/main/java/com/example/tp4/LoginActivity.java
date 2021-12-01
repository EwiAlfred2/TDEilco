package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(getLocalClassName());
        Button mButton = (Button) findViewById(R.id.button_send);
        EditText mEDTid = (EditText) findViewById(R.id.simpleEditText);
        EditText mEDTpwd = (EditText) findViewById(R.id.simpleEditText2);
        mButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), NewsActivity.class);
                intent.putExtra("login", mEDTid.getText().toString());
                intent.putExtra("Password", mEDTpwd.getText().toString());
                NewsListApplication app = (NewsListApplication) getApplicationContext();
                String login = app.getLogin();
                startActivity(intent);
            }
        });

    }
}