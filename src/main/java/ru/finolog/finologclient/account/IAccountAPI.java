package ru.finolog.finologclient.account;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ru.finolog.finologclient.account.entity.ALData;
import ru.finolog.finologclient.account.entity.Account;

public interface IAccountAPI {

    @GET("/v1/biz/{biz_id}")
    Call<ALData> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

    @GET("/v1/biz/{biz_id}/company/{company_id}/account/")
    Call<List<ALData>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId);

    @GET("/v1/biz/{biz_id}/company/{company_id}/account/{id}")
    Call<ALData> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("id") Integer id);

    @POST("/v1/biz/{biz_id}/account/")
    Call<ALData> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Body Account account);

    @POST("/v1/biz/{biz_id}/company/{company_id}/account/")
    Call<ALData> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Body Account account);

    @PUT("/v1/biz/{biz_id}/account/{id}")
    Call<ALData> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id, @Body Account account);

    @PUT("/v1/biz/{biz_id}/company/{company_id}/account/{id}")
    Call<ALData> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("id") Integer id, @Body Account account);

    @DELETE("/v1/biz/{biz_id}/account/{id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

    @DELETE("/v1/biz/{biz_id}/company/{company_id}/account/{id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("company_id") Integer companyId, @Path("id") Integer id);

}
