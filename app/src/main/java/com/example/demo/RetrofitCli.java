package com.example.demo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitCli {
    private static RetrofitCli instance = null;
    private TestApi api;

    private RetrofitCli(){
        Retrofit retrofit = new Retrofit.Builder().baseUrl(TestApi.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        api = retrofit.create(TestApi.class);
    }

    public static synchronized RetrofitCli getInstance(){
        if (instance == null){
            instance = new RetrofitCli();
        }
        return instance;
    }

    public TestApi getApi(){
        return api;
    }
}
