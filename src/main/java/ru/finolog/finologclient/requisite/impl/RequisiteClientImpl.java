package ru.finolog.finologclient.requisite.impl;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.requisite.RequisiteClient;
import ru.finolog.finologclient.requisite.IRequisiteAPI;
import ru.finolog.finologclient.requisite.entity.Requisite;

class RequisiteClientImpl implements RequisiteClient {

    private String apiToken;

    private IRequisiteAPI requisiteAPI;

    public RequisiteClientImpl(String apiToken, IRequisiteAPI requisiteAPI) {
        this.apiToken = apiToken;
        this.requisiteAPI = requisiteAPI;
    }

    public IRequisiteAPI api() {
        return requisiteAPI;
    }

    public Response<Requisite> one(Integer bizId, Integer id) throws IOException {

        return requisiteAPI.one(apiToken, bizId, id).execute();

    }

    public Response<Requisite> one(Integer bizId, Integer contractorId, Integer id) throws IOException {

        return requisiteAPI.one(apiToken, bizId, contractorId, id).execute();

    }

    public Response<List<Requisite>> list(Integer bizId) throws IOException {

        return requisiteAPI.list(apiToken, bizId).execute();

    }

    public Response<List<Requisite>> list(Integer bizId, Integer contractorId) throws IOException {

        return requisiteAPI.list(apiToken, bizId, contractorId).execute();

    }

    public Response<Requisite> create(Integer bizId, Requisite requisite) throws IOException {

        return requisiteAPI.create(apiToken, bizId, requisite).execute();

    }

    public Response<Requisite> create(Integer bizId, Integer contractorId, Requisite requisite) throws IOException {

        return requisiteAPI.create(apiToken, bizId, contractorId, requisite).execute();

    }

    public Response<Requisite> save(Integer bizId, Integer id, Requisite requisite) throws IOException {

        return requisiteAPI.save(apiToken, bizId, id, requisite).execute();

    }

    public Response<Requisite> save(Integer bizId, Integer id, Integer contractorId, Requisite requisite) throws IOException {

        return requisiteAPI.save(apiToken, bizId, id, contractorId, requisite).execute();

    }

    public Response delete(Integer bizId, Integer id) throws IOException {

        return requisiteAPI.delete(apiToken, bizId, id).execute();

    }

    public Response delete(Integer bizId, Integer contractorId, Integer id) throws IOException {

        return requisiteAPI.delete(apiToken, bizId, contractorId, id).execute();

    }
}
