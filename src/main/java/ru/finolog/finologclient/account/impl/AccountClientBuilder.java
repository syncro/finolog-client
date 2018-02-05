package ru.finolog.finologclient.account.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.experimental.Accessors;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.finolog.finologclient.FinologClientBuilder;
import ru.finolog.finologclient.account.AccountClient;
import ru.finolog.finologclient.account.IAccountAPI;

@Accessors(chain = true, fluent = true)
public class AccountClientBuilder extends FinologClientBuilder {

    private String schema;

    private String host;

    private String basePath;

    private String apiToken;

    private OkHttpClient httpClient;

    public AccountClient build() {

        if (httpClient == null) {
            httpClient = getOkHttpClient();
        }

        Gson gson = new GsonBuilder()
                .setDateFormat("yyyy-MM-dd HH:mm:ss")
                .create();

        HttpUrl url = new HttpUrl.Builder()
                .scheme(schema)
                .host(host)
                .addPathSegments(basePath).build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(httpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();

        IAccountAPI accountAPI = retrofit.create(IAccountAPI.class);

        return new AccountClientImpl(apiToken, accountAPI);
    }

    public AccountClientBuilder schema(String schema) {
        this.schema = schema;
        return this;
    }

    public AccountClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    public AccountClientBuilder basePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    public AccountClientBuilder apiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    public AccountClientBuilder httpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }
}
