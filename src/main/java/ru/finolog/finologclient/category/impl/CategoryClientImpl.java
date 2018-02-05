package ru.finolog.finologclient.category.impl;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.category.CategoryClient;
import ru.finolog.finologclient.category.ICategoryAPI;
import ru.finolog.finologclient.category.entity.Category;

class CategoryClientImpl implements CategoryClient {

    private String apiToken;

    private ICategoryAPI categoryAPI;

    public CategoryClientImpl(String apiToken, ICategoryAPI categoryAPI) {
        this.apiToken = apiToken;
        this.categoryAPI = categoryAPI;
    }

    public ICategoryAPI api() {
        return categoryAPI;
    }

    public Response<Category> one(Integer bizId, Integer id) throws IOException {

        return categoryAPI.one(apiToken, bizId, id).execute();

    }

    public Response<List<Category>> list(Integer bizId) throws IOException {

        return categoryAPI.list(apiToken, bizId).execute();

    }

    public Response<Category> create(Integer bizId, Category category) throws IOException {

        return categoryAPI.create(apiToken, bizId, category).execute();

    }

    public Response<Category> save(Integer bizId, Integer id, Category category) throws IOException {

        return categoryAPI.save(apiToken, bizId, id, category).execute();

    }

    public Response delete(Integer bizId, Integer id) throws IOException {

        return categoryAPI.delete(apiToken, bizId, id).execute();

    }

}
