package ru.finolog.finologclient.requisite;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ru.finolog.finologclient.requisite.entity.Requisite;

public interface IRequisiteAPI {


    @GET("/v1/biz/{biz_id}/requisite/{id}")
    Call<Requisite> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/contractor/{contractor_id}/requisite/{id}")
    Call<Requisite> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("contractor_id") Integer contractorId,  @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/requisite/")
    Call<List<Requisite>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

    @GET("/v1/biz/{biz_id}/contractor/{contractor_id}/requisite/")
    Call<List<Requisite>> list(@Header("Api-Token") String apiToken, @Path("contractor_id") Integer contractorId, @Path("biz_id") Integer bizId);

    @POST("/v1/biz/{biz_id}/requisite/")
    Call<Requisite> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Body Requisite requisite);

    @POST("/v1/biz/{biz_id}/contractor/{contractor_id}/requisite/")
    Call<Requisite> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("contractor_id") Integer contractorId, @Body Requisite requisite);

    @PUT("/v1/biz/{biz_id}/requisite/{id}")
    Call<Requisite> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id, @Body Requisite requisite);

    @PUT("/v1/biz/{biz_id}/contractor/{contractor_id}/requisite/{id}")
    Call<Requisite> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("contractor_id") Integer contractorId, @Path("id") Integer id, @Body Requisite requisite);

    @DELETE("/v1/biz/{biz_id}/requisite/{id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

    @DELETE("/v1/biz/{biz_id}/contractor/{contractor_id}/requisite/{id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("contractor_id") Integer contractorId, @Path("id") Integer id);
}
