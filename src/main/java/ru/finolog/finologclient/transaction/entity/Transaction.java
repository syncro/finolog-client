package ru.finolog.finologclient.transaction.entity;

import com.google.gson.annotations.SerializedName;

public class Transaction {

    public Integer id;

    @SerializedName("biz_id")
    public Integer bizId;

    @SerializedName("account_id")
    public Integer accountId;

    @SerializedName("category_id")
    public Integer categoryId;

    @SerializedName("contractor_id")
    public Integer contractorId;

    @SerializedName("requisite_id")
    public Integer requisiteId;

    @SerializedName("project_id")
    public Integer projectId;

    public Integer type;

    public String status;

    public String date;

    @SerializedName("report_date")
    public Integer reportDate;

    @SerializedName("value")
    public Double value;

    @SerializedName("base_value")
    public Double baseValue;

    public String description;

    @SerializedName("payment_number")
    public String paymentNumber;

    @SerializedName("transfer_id")
    public Integer transferId;

    @SerializedName("created_at")
    public Integer createdAt;

    @SerializedName("created_by_id")
    public Integer createdById;

    @SerializedName("updated_at")
    public Integer updatedAt;

    @SerializedName("updated_by_id")
    public Integer updatedById;
}