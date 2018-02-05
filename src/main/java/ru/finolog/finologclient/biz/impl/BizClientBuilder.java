package ru.finolog.finologclient.biz.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.experimental.Accessors;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.finolog.finologclient.FinologClientBuilder;
import ru.finolog.finologclient.biz.BizClient;
import ru.finolog.finologclient.biz.IBizAPI;

@Accessors(chain = true, fluent = true)
public class BizClientBuilder extends FinologClientBuilder {

    private String schema;

    private String host;

    private String basePath;

    private String apiToken;

    private OkHttpClient httpClient;

    public BizClient build() {

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

        IBizAPI bizAPI = retrofit.create(IBizAPI.class);

        return new BizClientImpl(apiToken, bizAPI);
    }

    public BizClientBuilder schema(String schema) {
        this.schema = schema;
        return this;
    }

    public BizClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    public BizClientBuilder basePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    public BizClientBuilder apiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    public BizClientBuilder httpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }
}
