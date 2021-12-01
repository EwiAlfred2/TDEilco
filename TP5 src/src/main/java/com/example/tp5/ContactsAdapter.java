package com.example.tp5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.MyViewHolder>{

    private final List<Contact> mcontact;
    public ContactsAdapter(List<Contact> mcontact) {
        this.mcontact = mcontact;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View contactView = inflater.inflate(R.layout.item_contact, parent, false);

        return new MyViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Contact contact = mcontact.get(position);

        TextView firstNameTextView = holder.firstNameTextView;
        firstNameTextView.setText(contact.getPrenom());

        TextView lastNameTextView = holder.lastNameTextView;
        lastNameTextView.setText(contact.getNom());
    }

    @Override
    public int getItemCount() {
        return mcontact.size();
    }

        public static class MyViewHolder extends RecyclerView.ViewHolder{
            public TextView firstNameTextView;
            public TextView lastNameTextView;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);
                firstNameTextView = itemView.findViewById(R.id.textview_nom);
                lastNameTextView = itemView.findViewById(R.id.textview_prenom);
            }
        }

    }


