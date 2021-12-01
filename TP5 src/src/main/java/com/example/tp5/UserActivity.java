package com.example.tp5;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserActivity extends AppCompatActivity {
    List<Contact> Contacts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        RecyclerView rv_contacts = (RecyclerView) findViewById(R.id.rvContacts);

        Contacts.add(new Contact("Pierre", "Jean"));
        Contacts.add(new Contact("D'Arc", "Jeanne"));
        Contacts.add(new Contact("Menez", "Pierre"));
        Contacts.add(new Contact("Rimbaud", "Arthur"));
        Contacts.add(new Contact("Astier", "Alexandre"));
        Contacts.add(new Contact("Gomez", "Gomez"));
        Contacts.add(new Contact("Trump", "Donald"));

        ContactsAdapter adapter = new ContactsAdapter(Contacts);
        rv_contacts.setAdapter(adapter);
        rv_contacts.setLayoutManager(new LinearLayoutManager(this));
    }
}
