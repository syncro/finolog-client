package ru.finolog.finologclient.currency;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.currency.entity.Currency;

public interface CurrencyClient {

    ICurrencyAPI api();

    Response<List<Currency>> list(Integer bizId) throws IOException;

}
