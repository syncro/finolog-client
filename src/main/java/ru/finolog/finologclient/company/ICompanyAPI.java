package ru.finolog.finologclient.company;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ru.finolog.finologclient.company.entity.Company;

public interface ICompanyAPI {

    @GET("/v1/biz/{biz_id}/company/{id}")
    Call<Company> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/company/")
    Call<List<Company>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

    @POST("/v1/biz/{biz_id}/company/")
    Call<Company> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Body Company category);

    @PUT("/v1/biz/{biz_id}/company/{id}")
    Call<Company> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id, @Body Company category);

    @DELETE("/v1/biz/{biz_id}/company/{id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

}
