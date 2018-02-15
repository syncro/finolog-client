package ru.finolog.finologclient.requisite.entity;

import com.google.gson.annotations.SerializedName;

public class Requisite {

    public Integer id;

    @SerializedName("contractor_id")
    public Integer contractor_id;

    public String name;

    public String description;

    @SerializedName("full_name")
    public String fullName;

    public String phone;

    public String email;

    public String web;

    public String inn;

    public String kpp;

    @SerializedName("bank_account")
    public String bankAccount;

    @SerializedName("bank_name")
    public String bankName;

    @SerializedName("bank_bic")
    public String bankBic;
}