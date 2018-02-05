package ru.finolog.finologclient.company.entity;

import com.google.gson.annotations.SerializedName;

public class Company {

    public Integer id;

    public String name;

    @SerializedName("biz_id")
    public Integer bizId;

    public String phone;

    public String email;

    public String web;

    public String inn;

    public String kpp;

    public String logo;

    public String stamp;

    @SerializedName("address_city")
    public String addressCity;

    @SerializedName("address_postal_index")
    public String addressPostalIndex;

    @SerializedName("address_street")
    public String addressStreet;

    @SerializedName("director_name")
    public String directorName;

    @SerializedName("director_position")
    public String directorPosition;

    @SerializedName("director_sign")
    public String directorSign;

    @SerializedName("summary")
    public Object summary;

    @SerializedName("planned_summary")
    public Object plannedSummary;
}