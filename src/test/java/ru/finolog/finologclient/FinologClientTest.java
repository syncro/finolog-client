package ru.finolog.finologclient;



import java.io.InputStream;
import java.util.Properties;

import lombok.SneakyThrows;

import static org.junit.Assert.fail;


public class FinologClientTest {

    @SneakyThrows
    protected Properties getProperties() {
        try {
            Properties properties = new Properties();
            InputStream in = getClass().getResourceAsStream("/finolog.properties");
            properties.load(in);
            in.close();
            return properties;
        } catch (Exception e) {
            fail("Failed to load finolog client properties: " + e.getMessage());
        }
        return null;
    }

}
