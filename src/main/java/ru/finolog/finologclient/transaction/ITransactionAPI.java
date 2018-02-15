package ru.finolog.finologclient.transaction;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import ru.finolog.finologclient.transaction.entity.Transaction;

public interface ITransactionAPI {

    @GET("/v1/biz/{biz_id}/company/{company_id}/account/{account_id}/transaction/{id}")
    Call<Transaction> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("account_id") Integer accountId, @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/company/{company_id}/transaction/{id}")
    Call<Transaction> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/transaction/{id}")
    Call<Transaction> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/company/{company_id}/account/{account_id}/transaction/")
    Call<List<Transaction>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("account_id") Integer accountId);

    @GET("/v1/biz/{biz_id}/company/{company_id}/transaction/")
    Call<List<Transaction>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId);

    @GET("/v1/biz/{biz_id}/transaction/")
    Call<List<Transaction>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

    @POST("/v1/biz/{biz_id}/company/{company_id}/transaction/{id}/split")
    Call<Transaction> split(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Body Double[] items);

    @PUT("/v1/biz/{biz_id}/company/{company_id}/transaction/{id}")
    Call<Transaction> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("id") Integer id, @Body Transaction transaction);

    @PUT("/v1/biz/{biz_id}/transaction/{id}")
    Call<Transaction> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id, @Body Transaction transaction);

    @POST("/v1/biz/{biz_id}/company/{company_id}/transaction")
    Call<Transaction> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Body Transaction transaction);

    @POST("/v1/biz/{biz_id}/transaction")
    Call<Transaction> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Body Transaction transaction);

    @DELETE("/v1/biz/{biz_id}/company/{company_id}/account/{account_id}/transaction/{id}")
    Call<Transaction> delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("account_id") Integer accountId, @Path("id") Integer id);

    @DELETE("/v1/biz/{biz_id}/company/{company_id}/transaction/{id}")
    Call<Transaction> delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("id") Integer id);

    @DELETE("/v1/biz/{biz_id}/transaction/{id}")
    Call<Transaction> delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);
}
