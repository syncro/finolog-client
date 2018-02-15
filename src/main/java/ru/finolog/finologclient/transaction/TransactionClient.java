package ru.finolog.finologclient.transaction;


import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Path;
import ru.finolog.finologclient.transaction.entity.Transaction;

public interface TransactionClient {

    ITransactionAPI api();

    Response<Transaction> one(Integer bizId, Integer companyId, Integer accountId, Integer id) throws IOException;

    Response<Transaction> one(Integer bizId, Integer companyId, Integer id) throws IOException;

    Response<Transaction> one(Integer bizId, Integer id) throws IOException;

    Response<List<Transaction>> list(Integer bizId, Integer companyId, Integer accountId) throws IOException;

    Response<List<Transaction>> list(Integer bizId, Integer companyId) throws IOException;

    Response<List<Transaction>> list(Integer bizId) throws IOException;

    Response<Transaction> split(Integer bizId, Integer companyId, Double[] items) throws IOException;

    Response<Transaction> save(Integer bizId, Integer companyId, Integer id, Transaction transaction) throws IOException;

    Response<Transaction> save(Integer bizId, Integer id, Transaction transaction) throws IOException;

    Response<Transaction> create(Integer bizId, Integer companyId, Integer id, Transaction transaction) throws IOException;

    Response<Transaction> create(Integer bizId, Integer id, Transaction transaction) throws IOException;

    Response<Transaction> delete(Integer bizId, Integer companyId, Integer accountId, Integer id) throws IOException;

    Response<Transaction> delete(Integer bizId, Integer companyId, Integer id) throws IOException;

    Response<Transaction> delete(Integer bizId, Integer id) throws IOException;
}
