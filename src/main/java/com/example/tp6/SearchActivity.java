package com.example.tp6;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class SearchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ProgressBar pbBar = (ProgressBar) findViewById(R.id.pb_main);
        ListView repoListView = (ListView) findViewById(R.id.repo_list);
        String query_name = "";
        Intent intent = getIntent();
        boolean hasLogin = intent.hasExtra("name");
        if(hasLogin)
            query_name =intent.getStringExtra("name");
        _GithubService service = new Retrofit.Builder()
                .baseUrl(_GithubService.ENDPOINT)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(_GithubService.class);
        service.CallListRepos("EwiAlfred2").enqueue(new Callback<List<Repo>>() {
            @Override
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                afficherRepos(response.body());
            }
            public void onFailure(Call<List<Repo>> call, Throwable t) {

            }

        });

        service.searchRepos(query_name).enqueue(new Callback<List<Repo>>() {
            public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
                pbBar.setVisibility(View.INVISIBLE);


//                Toast.makeText(MainActivity.this,response.message().toString(),Toast.LENGTH_LONG).show();

                List<Repo> list = response.body(); // return the response to a list object


                RepoArrayAdapter arrayAdapter = new RepoArrayAdapter(SearchActivity.this,list); // setup the adapter

//
                repoListView.setAdapter(arrayAdapter); // attach adapter to list view
            }

            @Override
            public void onFailure(Call<List<Repo>> call, Throwable t) {
                pbBar.setVisibility(View.INVISIBLE);
            }

        });
    }

    public void afficherRepos(List<Repo> repos) {
        Toast.makeText(this,"nombre de dépots : "+repos.size(), Toast.LENGTH_SHORT).show();
    }
}