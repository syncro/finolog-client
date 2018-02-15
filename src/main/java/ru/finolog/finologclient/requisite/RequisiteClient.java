package ru.finolog.finologclient.requisite;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.requisite.entity.Requisite;

public interface RequisiteClient {

    IRequisiteAPI api();

    Response<Requisite> one(Integer bizId, Integer id) throws IOException;

    Response<Requisite> one(Integer bizId, Integer contractorId, Integer id) throws IOException;

    Response<List<Requisite>> list(Integer bizId) throws IOException;

    Response<List<Requisite>> list(Integer bizId, Integer contractorId) throws IOException;

    Response<Requisite> create(Integer bizId, Requisite requisite) throws IOException;

    Response<Requisite> create(Integer bizId, Integer contractorId, Requisite requisite) throws IOException;

    Response<Requisite> save(Integer bizId, Integer id, Requisite requisite) throws IOException;

    Response<Requisite> save(Integer bizId, Integer contractorId, Integer id, Requisite requisite) throws IOException;

    Response delete(Integer bizId, Integer id) throws IOException;

    Response delete(Integer bizId, Integer contractorId, Integer id) throws IOException;
}
