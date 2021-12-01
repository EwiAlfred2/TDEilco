package com.example.tp5;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity{
        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_contact);

        Contact person = new Contact();
        person.Nom = "Boulay";
        person.Prenom = "Emeric";
        person.UrlImage = null;

        TextView NomTextView = (TextView) findViewById(R.id.textview_nom);
        TextView PrenomTextView = (TextView) findViewById(R.id.textview_prenom);
        NomTextView.setText(person.Nom);
        PrenomTextView.setText(person.Prenom);
        }
}
