package ru.finolog.finologclient.biz.impl;


import java.io.IOException;

import retrofit2.Response;
import ru.finolog.finologclient.biz.BizClient;
import ru.finolog.finologclient.biz.IBizAPI;
import ru.finolog.finologclient.biz.entity.Biz;

class BizClientImpl implements BizClient {

    private String apiToken;

    private IBizAPI bizAPI;

    public BizClientImpl(String apiToken, IBizAPI bizAPI) {
        this.apiToken = apiToken;
        this.bizAPI = bizAPI;
    }

    public IBizAPI api() {
        return bizAPI;
    }

    public Response<Biz> one(Integer bizId) throws IOException {

        return bizAPI.one(apiToken, bizId).execute();

    }

    public Response<Biz> list() throws IOException {

        return bizAPI.list(apiToken).execute();

    }

    public Response<Biz> create(Biz biz) throws IOException {

        return bizAPI.create(apiToken, biz).execute();

    }

    public Response<Biz> save(Integer bizId, Biz biz) throws IOException {

        return bizAPI.save(apiToken, bizId, biz).execute();

    }

    public Response<Biz> delete(Integer bizId) throws IOException {

        return bizAPI.delete(apiToken, bizId).execute();

    }

}
