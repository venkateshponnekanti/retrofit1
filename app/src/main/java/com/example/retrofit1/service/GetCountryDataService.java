package com.example.retrofit1.service;

import com.example.retrofit1.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetCountryDataService {

    @GET("countries")
    Call<Result> getResult();
}