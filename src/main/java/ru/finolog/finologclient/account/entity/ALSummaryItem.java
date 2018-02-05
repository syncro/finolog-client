package ru.finolog.finologclient.account.entity;

import com.google.gson.annotations.SerializedName;

public class ALSummaryItem {

    public String date;

    @SerializedName("currency_id")
    public Integer currencyId;

    public String type;

    public Double balance;

    public Double incoming;

    public Double outcoming;

    @SerializedName("base_balance")
    public Double baseBalance;

    @SerializedName("base_incoming")
    public Double baseIncoming;

    @SerializedName("base_outcoming")
    public Double baseOutcoming;

    @SerializedName("biz_id")
    public Integer bizId;

    @SerializedName("company_id")
    public Integer companyId;

    @SerializedName("account_id")
    public Integer accountId;
}
