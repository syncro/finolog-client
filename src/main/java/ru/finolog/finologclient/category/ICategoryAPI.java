package ru.finolog.finologclient.category;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import ru.finolog.finologclient.category.entity.Category;

public interface ICategoryAPI {

    @GET("/v1/biz/{biz_id}/category/{id}")
    Call<Category> one(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

    @GET("/v1/biz/{biz_id}/category/")
    Call<List<Category>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

    @POST("/v1/biz/{biz_id}/category/")
    Call<Category> create(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Body Category category);

    @PUT("/v1/biz/{biz_id}/category/{id}")
    Call<Category> save(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id, @Body Category category);

    @DELETE("/v1/biz/{biz_id}/category/{id}")
    Call delete(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId, @Path("id") Integer id);

}
