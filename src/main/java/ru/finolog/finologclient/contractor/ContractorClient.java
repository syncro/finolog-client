package ru.finolog.finologclient.contractor;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.contractor.entity.Contractor;

public interface ContractorClient {

    IContractorAPI api();

    Response<Contractor> one(Integer bizId, Integer id) throws IOException;

    Response<List<Contractor>> list(Integer bizId) throws IOException;

    Response<Contractor> create(Integer bizId, Contractor category) throws IOException;

    Response<Contractor> save(Integer bizId, Integer id, Contractor category) throws IOException;

    Response delete(Integer id, Integer categoryId) throws IOException;

}
