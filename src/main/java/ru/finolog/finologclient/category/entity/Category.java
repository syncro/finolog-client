package ru.finolog.finologclient.category.entity;

import com.google.gson.annotations.SerializedName;

public class Category {

    public Integer id;

    public String name;

    @SerializedName("biz_id")
    public Integer bizId;

    public String type;

    public String activities;

    public String code;

}