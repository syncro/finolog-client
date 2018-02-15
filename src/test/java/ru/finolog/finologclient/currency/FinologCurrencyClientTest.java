package ru.finolog.finologclient.currency;


import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;
import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.currency.entity.Currency;
import ru.finolog.finologclient.currency.impl.CurrencyClientBuilder;

import static org.junit.Assert.assertNotNull;

public class FinologCurrencyClientTest extends FinologClientTest {


    @SneakyThrows
    private CurrencyClient getCurrencyClient() {
        Properties properties = getProperties();

        return new CurrencyClientBuilder()
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

        CurrencyClient currencyClient = getCurrencyClient();
        Response<List<Currency>> currencyResponse = currencyClient.list(12111);

        assertNotNull(currencyResponse.body());
    }


}
