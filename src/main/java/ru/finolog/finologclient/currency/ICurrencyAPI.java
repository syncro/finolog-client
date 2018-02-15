package ru.finolog.finologclient.currency;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Path;
import ru.finolog.finologclient.currency.entity.Currency;

public interface ICurrencyAPI {

    @GET("/v1/currency/")
    Call<List<Currency>> list(@Header("Api-Token") String apiToken, @Path("biz_id") Integer bizId);

}
