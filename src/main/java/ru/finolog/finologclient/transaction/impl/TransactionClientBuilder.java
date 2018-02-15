package ru.finolog.finologclient.transaction.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import lombok.experimental.Accessors;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import ru.finolog.finologclient.FinologClientBuilder;
import ru.finolog.finologclient.transaction.TransactionClient;
import ru.finolog.finologclient.transaction.ITransactionAPI;

@Accessors(chain = true, fluent = true)
public class TransactionClientBuilder extends FinologClientBuilder {

    private String schema;

    private String host;

    private String basePath;

    private String apiToken;

    private OkHttpClient httpClient;

    public TransactionClient build() {

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

        ITransactionAPI companyAPI = retrofit.create(ITransactionAPI.class);

        return new TransactionClientImpl(apiToken, companyAPI);
    }

    public TransactionClientBuilder schema(String schema) {
        this.schema = schema;
        return this;
    }

    public TransactionClientBuilder host(String host) {
        this.host = host;
        return this;
    }

    public TransactionClientBuilder basePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    public TransactionClientBuilder apiToken(String apiToken) {
        this.apiToken = apiToken;
        return this;
    }

    public TransactionClientBuilder httpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }
}
