package ru.finolog.finologclient.user;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.PUT;
import ru.finolog.finologclient.user.entity.User;

public interface IUserAPI {

    @GET("/v1/user")
    Call<User> current(@Header("Api-Token") String apiToken);

    @PUT("/v1/user")
    Call<User> save(@Header("Api-Token") String apiToken, User user);
}
