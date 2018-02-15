package ru.finolog.finologclient.category;


import org.junit.Ignore;
import org.junit.Test;

import java.util.List;
import java.util.Properties;

import lombok.SneakyThrows;
import retrofit2.Response;
import ru.finolog.finologclient.FinologClientTest;
import ru.finolog.finologclient.category.entity.Category;
import ru.finolog.finologclient.category.impl.CategoryClientBuilder;

import static org.junit.Assert.assertNotNull;

public class FinologCategoryClientTest extends FinologClientTest {


    @SneakyThrows
    private CategoryClient getCategoryClient() {
        Properties properties = getProperties();

        return new CategoryClientBuilder()
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

        CategoryClient categoryClient = getCategoryClient();
        Response<List<Category>> categoryResponse = categoryClient.list(12111);

        assertNotNull(categoryResponse.body());
    }


}
