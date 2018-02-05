package ru.finolog.finologclient.company;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.company.entity.Company;

public interface CompanyClient {

    ICompanyAPI api();

    Response<Company> one(Integer bizId, Integer id) throws IOException;

    Response<List<Company>> list(Integer bizId) throws IOException;

    Response<Company> create(Integer bizId, Company category) throws IOException;

    Response<Company> save(Integer bizId, Integer id, Company category) throws IOException;

    Response delete(Integer id, Integer categoryId) throws IOException;

}
