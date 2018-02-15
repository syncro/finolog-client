package ru.finolog.finologclient.currency.impl;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.currency.CurrencyClient;
import ru.finolog.finologclient.currency.ICurrencyAPI;
import ru.finolog.finologclient.currency.entity.Currency;

class CurrencyClientImpl implements CurrencyClient {

    private String apiToken;

    private ICurrencyAPI companyAPI;

    public CurrencyClientImpl(String apiToken, ICurrencyAPI companyAPI) {
        this.apiToken = apiToken;
        this.companyAPI = companyAPI;
    }

    public ICurrencyAPI api() {
        return companyAPI;
    }


    public Response<List<Currency>> list(Integer bizId) throws IOException {

        return companyAPI.list(apiToken, bizId).execute();

    }

}
