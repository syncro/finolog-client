package ru.finolog.finologclient.category;


import java.io.IOException;
import java.util.List;

import retrofit2.Response;
import ru.finolog.finologclient.category.entity.Category;

public interface CategoryClient {

    ICategoryAPI api();

    Response<Category> one(Integer bizId, Integer id) throws IOException;

    Response<List<Category>> list(Integer bizId) throws IOException;

    Response<Category> create(Integer bizId, Category category) throws IOException;

    Response<Category> save(Integer bizId, Integer id, Category category) throws IOException;

    Response delete(Integer id, Integer categoryId) throws IOException;

}
