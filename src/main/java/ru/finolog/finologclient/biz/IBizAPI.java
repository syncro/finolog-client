package ru.finolog.finologclient.biz;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ru.finolog.finologclient.biz.entity.Biz;

public interface IBizAPI {

    @GET("/v1/biz/{biz_id}")
    Call<Biz> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

    @GET("/v1/biz/")
    Call<Biz> list(@Header("Api-Token") String apiToken);

    @POST("/v1/biz/")
    Call<Biz> create(@Header("Api-Token") String apiToken, @Body Biz biz);

    @PUT("/v1/biz/{biz_id}")
    Call<Biz> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Body Biz biz);

    @DELETE("/v1/biz/{biz_id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

}
