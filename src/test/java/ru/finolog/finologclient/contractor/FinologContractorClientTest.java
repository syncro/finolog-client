package ru.finolog.finologclient.contractor;


import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;
import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.contractor.entity.Contractor;
import ru.finolog.finologclient.contractor.impl.ContractorClientBuilder;

import static org.junit.Assert.assertNotNull;

public class FinologContractorClientTest extends FinologClientTest {


    @SneakyThrows
    private ContractorClient getContractorClient() {
        Properties properties = getProperties();

        return new ContractorClientBuilder()
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

        ContractorClient contractorClient = getContractorClient();
        Response<List<Contractor>> contractorResponse = contractorClient.list(12111);

        assertNotNull(contractorResponse.body());
    }


}
