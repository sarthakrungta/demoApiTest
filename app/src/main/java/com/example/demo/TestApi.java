package com.example.demo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TestApi {
    String BASE_URL = "https://reqres.in/api/users/";

    @GET(".")
    Call<List<UserDataModel>> getData();
}
