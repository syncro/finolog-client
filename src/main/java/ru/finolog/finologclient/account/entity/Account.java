package ru.finolog.finologclient.account.entity;

import com.google.gson.annotations.SerializedName;

public class Account {

    @SerializedName("biz_id")
    public Integer bizId;

    @SerializedName("company_id")
    public Integer companyId;

    @SerializedName("currency_id")
    public Integer currencyId;

    public String name;

    @SerializedName("initial_balance")
    public Double initialBalance;

    @SerializedName("bank_account")
    public Integer bankAccount;

    @SerializedName("bank_bic")
    public Integer bankBic;
}
