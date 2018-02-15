package ru.finolog.finologclient.currency.entity;

import com.google.gson.annotations.SerializedName;

public class Currency {

    public Integer id;

    public String code;

    public String name;

    @SerializedName("last_rates")
    public Object[] lastRates;

}