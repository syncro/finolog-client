package ru.finolog.finologclient.transaction;


import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;
import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.transaction.entity.Transaction;
import ru.finolog.finologclient.transaction.impl.TransactionClientBuilder;

import static org.junit.Assert.assertNotNull;

public class FinologTransactionClientTest extends FinologClientTest {


    @SneakyThrows
    private TransactionClient getTransactionClient() {
        Properties properties = getProperties();

        return new TransactionClientBuilder()
                .schema(properties.getProperty("finolog.schema"))
                .host(properties.getProperty("finolog.host"))
                .basePath(properties.getProperty("finolog.basePath"))
                .apiToken(properties.getProperty("finolog.apiToken"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testList() {

        TransactionClient transactionClient = getTransactionClient();
        Response<List<Transaction>> transactionResponse = transactionClient.list(12111);

        assertNotNull(transactionResponse.body());
    }


}
