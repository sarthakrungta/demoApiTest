package com.example.demo;

import com.google.gson.annotations.SerializedName;

public class UserDataModel {

    @SerializedName("id")
    Integer id;

    @SerializedName("email")
    String email;

    @SerializedName("first_name")
    String firstName;

    @SerializedName("last_name")
    String lastName;

    @SerializedName("avatar")
    String avatar;

    public UserDataModel(Integer id, String email, String firstName, String lastName, String avatar) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
    }
}
