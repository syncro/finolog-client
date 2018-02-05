package ru.finolog.finologclient.account;


import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.account.entity.ALData;
import ru.finolog.finologclient.account.impl.AccountClientBuilder;

import org.junit.Ignore;
import org.junit.Test;

import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;

import static org.junit.Assert.assertNotNull;

public class FinologAccountClientTest extends FinologClientTest {


    @SneakyThrows
    private AccountClient getAccountClient() {
        Properties properties = getProperties();

        return new AccountClientBuilder()
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

        AccountClient accountClient = getAccountClient();
        Response<ALData> accountsResponse = accountClient.list(12111);

        assertNotNull(accountsResponse.body());
    }


}
