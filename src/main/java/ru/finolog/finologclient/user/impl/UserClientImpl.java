package ru.finolog.finologclient.user.impl;


import java.io.IOException;

import retrofit2.Response;
import ru.finolog.finologclient.user.IUserAPI;
import ru.finolog.finologclient.user.UserClient;
import ru.finolog.finologclient.user.entity.User;

class UserClientImpl implements UserClient {

    private String apiToken;

    private IUserAPI userAPI;

    public UserClientImpl(String apiToken, IUserAPI userAPI) {
        this.apiToken = apiToken;
        this.userAPI = userAPI;
    }

    public IUserAPI api() {
        return userAPI;
    }

    @Override
    public Response<User> current() throws IOException {
        return userAPI.current(apiToken).execute();
    }

    @Override
    public Response<User> save(User user) throws IOException {
        return userAPI.save(apiToken, user).execute();
    }


}
