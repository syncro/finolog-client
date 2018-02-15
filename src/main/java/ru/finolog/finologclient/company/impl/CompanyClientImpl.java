package ru.finolog.finologclient.company.impl;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.company.CompanyClient;
import ru.finolog.finologclient.company.ICompanyAPI;
import ru.finolog.finologclient.company.entity.Company;

class CompanyClientImpl implements CompanyClient {

    private String apiToken;

    private ICompanyAPI companyAPI;

    public CompanyClientImpl(String apiToken, ICompanyAPI companyAPI) {
        this.apiToken = apiToken;
        this.companyAPI = companyAPI;
    }

    public ICompanyAPI api() {
        return companyAPI;
    }

    public Response<Company> one(Integer bizId, Integer id) throws IOException {

        return companyAPI.one(apiToken, bizId, id).execute();

    }

    public Response<List<Company>> list(Integer bizId) throws IOException {

        return companyAPI.list(apiToken, bizId).execute();

    }

    public Response<Company> create(Integer bizId, Company company) throws IOException {

        return companyAPI.create(apiToken, bizId, company).execute();

    }

    public Response<Company> save(Integer bizId, Integer id, Company company) throws IOException {

        return companyAPI.save(apiToken, bizId, id, company).execute();

    }

    public Response delete(Integer bizId, Integer id) throws IOException {

        return companyAPI.delete(apiToken, bizId, id).execute();

    }

}
