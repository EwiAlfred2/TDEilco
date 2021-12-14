package com.example.tp6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class RepoArrayAdapter extends ArrayAdapter<Repo> {
    public RepoArrayAdapter(@NonNull Context context, @NonNull List<Repo> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int pos, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        Repo rep = getItem(pos);

        if(convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.rowitem_layout,parent,false);
        }
        TextView tvName = convertView.findViewById(R.id.tv_repo);

        tvName.setText(rep.getName());
        return convertView;
    }
}
