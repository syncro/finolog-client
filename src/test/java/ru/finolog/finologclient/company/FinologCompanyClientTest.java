package ru.finolog.finologclient.company;


import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;
import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.company.entity.Company;
import ru.finolog.finologclient.company.impl.CompanyClientBuilder;

import static org.junit.Assert.assertNotNull;

public class FinologCompanyClientTest extends FinologClientTest {


    @SneakyThrows
    private CompanyClient getCompanyClient() {
        Properties properties = getProperties();

        return new CompanyClientBuilder()
                .schema(properties.getProperty("finolog.schema"))
                .host(properties.getProperty("finolog.host"))
                .basePath(properties.getProperty("finolog.basePath"))
                .apiToken(properties.getProperty("finolog.apiToken"))
                .build();
    }

    @Test
    //@Ignore
    @SneakyThrows
    public void testList() {

        CompanyClient companyClient = getCompanyClient();
        Response<List<Company>> companyResponse = companyClient.list(12111);

        assertNotNull(companyResponse.body());
    }


}
