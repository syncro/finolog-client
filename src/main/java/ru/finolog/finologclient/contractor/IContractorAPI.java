package ru.finolog.finologclient.contractor;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ru.finolog.finologclient.contractor.entity.Contractor;

public interface IContractorAPI {

    @GET("/v1/biz/{biz_id}/contractor/{id}")
    Call<Contractor> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/contractor/")
    Call<List<Contractor>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

    @POST("/v1/biz/{biz_id}/contractor/")
    Call<Contractor> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Body Contractor category);

    @PUT("/v1/biz/{biz_id}/contractor/{id}")
    Call<Contractor> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id, @Body Contractor category);

    @DELETE("/v1/biz/{biz_id}/contractor/{id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

}
