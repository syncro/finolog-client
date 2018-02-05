package ru.finolog.finologclient.biz;


import java.io.IOException;

import retrofit2.Response;
import ru.finolog.finologclient.biz.entity.Biz;

public interface BizClient {

    IBizAPI api();

    Response<Biz> one(Integer bizId) throws IOException;

    Response<Biz> list() throws IOException;

    Response<Biz> create(Biz biz) throws IOException;

    Response<Biz> save(Integer bizId, Biz biz) throws IOException;

    Response delete(Integer bizId) throws IOException;

}
