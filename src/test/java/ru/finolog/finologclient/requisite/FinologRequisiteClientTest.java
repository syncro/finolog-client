package ru.finolog.finologclient.requisite;


import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;
import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.requisite.entity.Requisite;
import ru.finolog.finologclient.requisite.impl.RequisiteClientBuilder;

import static org.junit.Assert.assertNotNull;

public class FinologRequisiteClientTest extends FinologClientTest {


    @SneakyThrows
    private RequisiteClient getRequisiteClient() {
        Properties properties = getProperties();

        return new RequisiteClientBuilder()
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

        RequisiteClient requisiteClient = getRequisiteClient();
        Response<List<Requisite>> requisiteResponse = requisiteClient.list(12111);

        assertNotNull(requisiteResponse.body());
    }


}
