package ru.finolog.finologclient.biz.entity;

import com.google.gson.annotations.SerializedName;

public class Biz {

    public Integer id;

    public String name;

    @SerializedName("base_currency_id")
    public Integer baseCurrencyId;

    @SerializedName("owner_id")
    public Integer ownerId;

    public Object participants;

    public Object expiration;

    public Object summary;

    @SerializedName("planned_summary")
    public Object plannedSummary;
}
