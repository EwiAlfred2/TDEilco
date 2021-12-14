package com.example.tp6;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface _GithubService {
    public static final String ENDPOINT = "https://api.github.com";

    @GET("/users/EwiAlfred2/repos")
    public Call<List<Repo>> listRepos(@Path("user") String user);

    @GET("/search/repositories")
    public Call<List<Repo>> searchRepos(@Query("q") String query);


    @GET("/users/{user}/repos")
    public Call<List<Repo>> CallListRepos(@Path("user") String user);



}
