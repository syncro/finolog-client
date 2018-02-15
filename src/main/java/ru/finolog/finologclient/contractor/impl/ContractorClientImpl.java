package ru.finolog.finologclient.contractor.impl;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.contractor.ContractorClient;
import ru.finolog.finologclient.contractor.IContractorAPI;
import ru.finolog.finologclient.contractor.entity.Contractor;

class ContractorClientImpl implements ContractorClient {

    private String apiToken;

    private IContractorAPI companyAPI;

    public ContractorClientImpl(String apiToken, IContractorAPI companyAPI) {
        this.apiToken = apiToken;
        this.companyAPI = companyAPI;
    }

    public IContractorAPI api() {
        return companyAPI;
    }

    public Response<Contractor> one(Integer bizId, Integer id) throws IOException {

        return companyAPI.one(apiToken, bizId, id).execute();

    }

    public Response<List<Contractor>> list(Integer bizId) throws IOException {

        return companyAPI.list(apiToken, bizId).execute();

    }

    public Response<Contractor> create(Integer bizId, Contractor category) throws IOException {

        return companyAPI.create(apiToken, bizId, category).execute();

    }

    public Response<Contractor> save(Integer bizId, Integer id, Contractor category) throws IOException {

        return companyAPI.save(apiToken, bizId, id, category).execute();

    }

    public Response delete(Integer bizId, Integer id) throws IOException {

        return companyAPI.delete(apiToken, bizId, id).execute();

    }

}
