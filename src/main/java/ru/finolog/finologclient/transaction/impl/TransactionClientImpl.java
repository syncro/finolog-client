package ru.finolog.finologclient.transaction.impl;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.transaction.TransactionClient;
import ru.finolog.finologclient.transaction.ITransactionAPI;
import ru.finolog.finologclient.transaction.entity.Transaction;

class TransactionClientImpl implements TransactionClient {

    private String apiToken;

    private ITransactionAPI transactionAPI;

    public TransactionClientImpl(String apiToken, ITransactionAPI transactionAPI) {
        this.apiToken = apiToken;
        this.transactionAPI = transactionAPI;
    }

    public ITransactionAPI api() {
        return transactionAPI;
    }

    @Override
    public Response<Transaction> one(Integer bizId, Integer companyId, Integer accountId, Integer id) throws IOException {

        return transactionAPI.one(apiToken, bizId, companyId, accountId, id).execute();

    }

    @Override
    public Response<Transaction> one(Integer bizId, Integer companyId, Integer id) throws IOException {

        return transactionAPI.one(apiToken, bizId, companyId, id).execute();

    }

    @Override
    public Response<Transaction> one(Integer bizId, Integer id) throws IOException {

        return transactionAPI.one(apiToken, bizId, id).execute();

    }

    @Override
    public Response<List<Transaction>> list(Integer bizId, Integer companyId, Integer accountId) throws IOException {

        return transactionAPI.list(apiToken, bizId, companyId, accountId).execute();

    }

    @Override
    public Response<List<Transaction>> list(Integer bizId, Integer companyId) throws IOException {

        return transactionAPI.list(apiToken, bizId, companyId).execute();

    }


    public Response<List<Transaction>> list(Integer bizId) throws IOException {

        return transactionAPI.list(apiToken, bizId).execute();

    }

    @Override
    public Response<Transaction> split(Integer bizId, Integer companyId, Double[] items) throws IOException {

        return transactionAPI.split(apiToken, bizId, companyId, items).execute();

    }

    @Override
    public Response<Transaction> save(Integer bizId, Integer companyId, Integer id, Transaction transaction) throws IOException {

        return transactionAPI.save(apiToken, bizId, companyId, id, transaction).execute();

    }

    @Override
    public Response<Transaction> save(Integer bizId, Integer id, Transaction transaction) throws IOException {

        return transactionAPI.save(apiToken, bizId, id, transaction).execute();

    }

    @Override
    public Response<Transaction> create(Integer bizId, Integer companyId, Integer id, Transaction transaction) throws IOException {

        return transactionAPI.save(apiToken, bizId, companyId, id, transaction).execute();

    }

    @Override
    public Response<Transaction> create(Integer bizId, Integer id, Transaction transaction) throws IOException {

        return transactionAPI.save(apiToken, bizId, id, transaction).execute();

    }

    @Override
    public Response<Transaction> delete(Integer bizId, Integer companyId, Integer accountId, Integer id) throws IOException {

        return transactionAPI.delete(apiToken, bizId, companyId, accountId, id).execute();

    }

    @Override
    public Response<Transaction> delete(Integer bizId, Integer companyId, Integer id) throws IOException {

        return transactionAPI.delete(apiToken, bizId, companyId, id).execute();

    }

    @Override
    public Response<Transaction> delete(Integer bizId, Integer id) throws IOException {

        return transactionAPI.delete(apiToken, bizId, id).execute();

    }

}
