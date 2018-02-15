package ru.finolog.finologclient.user;


import java.io.IOException;

import retrofit2.Response;
import ru.finolog.finologclient.user.entity.User;

public interface UserClient {

    IUserAPI api();

    Response<User> current() throws IOException;

    Response<User> save(User user) throws IOException;

}
