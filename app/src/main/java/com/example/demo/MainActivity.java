package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fetchData();
    }

    public void fetchData(){
        Call<List<UserDataModel>> call = RetrofitCli.getInstance().getApi().getData();
        call.enqueue(new Callback<List<UserDataModel>>() {
            @Override
            public void onResponse(Call<List<UserDataModel>> call, Response<List<UserDataModel>> response) {
                List<UserDataModel> userList = response.body();


                Log.d("TAG", "DATA: " + userList);
            }

            @Override
            public void onFailure(Call<List<UserDataModel>> call, Throwable t) {
                Log.d("TAG", "DATA NOT FOUND");
            }
        });
    }
}