package ru.finolog.finologclient.user;


import org.junit.Ignore;
import org.junit.Test;

import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;
import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.user.entity.User;
import ru.finolog.finologclient.user.impl.UserClientBuilder;

import static org.junit.Assert.assertNotNull;

public class FinologUserClientTest extends FinologClientTest {


    @SneakyThrows
    private UserClient getUserClient() {
        Properties properties = getProperties();

        return new UserClientBuilder()
                .schema(properties.getProperty("finolog.schema"))
                .host(properties.getProperty("finolog.host"))
                .basePath(properties.getProperty("finolog.basePath"))
                .apiToken(properties.getProperty("finolog.apiToken"))
                .build();
    }

    @Test
    @Ignore
    @SneakyThrows
    public void testCurrent() {

        UserClient userClient = getUserClient();
        Response<User> userResponse = userClient.current();

        assertNotNull(userResponse.body());
    }


}
