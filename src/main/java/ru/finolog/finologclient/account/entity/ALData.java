package ru.finolog.finologclient.account.entity;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

public class ALData {

    public Integer id;

    public String name;

    @SerializedName("created_at")
    public Date createdAt;

    @SerializedName("updated_at")
    public Date updatedAt;

    @SerializedName("created_by_id")
    public Integer createdById;

    @SerializedName("updated_by_id")
    public Integer updatedById;

    @SerializedName("owner_id")
    public Integer ownerId;

    public String cashflow;

    @SerializedName("is_new")
    public Boolean isNew;

    @SerializedName("is_demo")
    public Boolean isDemo;

    @SerializedName("base_currency_id")
    public Integer baseCurrencyId;

    @SerializedName("deleted_at")
    public Date deletedAt;

    @SerializedName("deleted_by_id")
    public Integer deletedById;

    public List<ALSummaryItem> summary;

    @SerializedName("planned_summary")
    public List<ALSummaryItem> planned_summary;

    @SerializedName("participants")
    public List<Integer> participants;

    @SerializedName("settings")
    public List<String> settings;


}
