package ru.finolog.finologclient.account;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.account.entity.ALData;
import ru.finolog.finologclient.account.entity.Account;

public interface AccountClient {

    IAccountAPI api();

    Response<ALData> list(Integer bizId) throws IOException;

    Response<List<ALData>> list(Integer bizId, Integer companyId) throws IOException;

    Response<ALData> one(Integer bizId, Integer companyId, Integer id) throws IOException;

    Response<ALData> create(Integer bizId, Account account) throws IOException;

    Response<ALData> create(Integer bizId, Integer companyId, Account account) throws IOException;

    Response<ALData> save(Integer bizId, Integer id, Account account) throws IOException;

    Response<ALData> save(Integer bizId, Integer companyId, Integer id, Account account) throws IOException;

    Response<ALData> delete(Integer bizId, Integer id) throws IOException;

    Response<ALData> delete(Integer bizId, Integer companyId, Integer id) throws IOException;
}
