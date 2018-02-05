package ru.finolog.finologclient.account.impl;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.account.AccountClient;
import ru.finolog.finologclient.account.IAccountAPI;
import ru.finolog.finologclient.account.entity.ALData;
import ru.finolog.finologclient.account.entity.Account;

class AccountClientImpl implements AccountClient {

    private String apiToken;

    private IAccountAPI accountAPI;

    public AccountClientImpl(String apiToken, IAccountAPI accountAPI) {
        this.apiToken = apiToken;
        this.accountAPI = accountAPI;
    }

    public IAccountAPI api() {
        return accountAPI;
    }


    public Response<ALData> list(Integer bizId) throws IOException {

        return accountAPI.list(apiToken, bizId).execute();

    }

    public Response<List<ALData>> list(Integer bizId, Integer companyId) throws IOException {

        return accountAPI.list(apiToken, bizId, companyId).execute();

    }

    public Response<ALData> one(Integer bizId, Integer companyId, Integer id) throws IOException {

        return accountAPI.one(apiToken, bizId, companyId, id).execute();

    }

    public Response<ALData> create(Integer bizId, Account account) throws IOException {

        return accountAPI.create(apiToken, bizId, account).execute();

    }

    public Response<ALData> create(Integer bizId, Integer companyId, Account account) throws IOException {

        return accountAPI.create(apiToken, bizId, companyId, account).execute();

    }

    public Response<ALData> save(Integer bizId, Integer id, Account account) throws IOException {

        return accountAPI.save(apiToken, bizId, id, account).execute();

    }

    public Response<ALData> save(Integer bizId, Integer companyId, Integer id, Account account) throws IOException {

        return accountAPI.save(apiToken, bizId, companyId, id, account).execute();

    }

    public Response<ALData> delete(Integer bizId, Integer id) throws IOException {

        return accountAPI.delete(apiToken, bizId, id).execute();

    }

    public Response<ALData> delete(Integer bizId, Integer companyId, Integer id) throws IOException {

        return accountAPI.delete(apiToken, bizId, companyId, id).execute();

    }
}
