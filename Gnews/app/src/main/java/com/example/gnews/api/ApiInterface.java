package com.example.gnews.api;


import com.example.gnews.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews(
            @Query("lang") String lang,
            @Query("token") String token
    );

    @GET("search")
    Call<News> getNewsSearch(
            @Query("q") String keyword,
            @Query("lang") String lang,
            @Query("token") String token
    );

}


