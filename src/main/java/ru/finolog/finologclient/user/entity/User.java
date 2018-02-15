package ru.finolog.finologclient.user.entity;

import com.google.gson.annotations.SerializedName;

public class User {

    public Integer id;

    @SerializedName("first_name")
    public String firstName;

    @SerializedName("last_name")
    public String lastName;

    public String email;

    public String phone;

    public Object expiration;

    public String online;
}
