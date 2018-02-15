package ru.finolog.finologclient.contractor.entity;

import com.google.gson.annotations.SerializedName;

public class Contractor {

    public Integer id;

    public String name;

    @SerializedName("biz_id")
    public Integer bizId;

    public String phone;

    public String email;

    public String person;

    public String description;

}