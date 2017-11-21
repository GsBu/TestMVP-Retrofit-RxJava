package com.example.camdora.testmvp_retrofit_rxjava;

import com.example.camdora.testmvp_retrofit_rxjava.model.Book;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by camdora on 17-11-21.
 */

public interface RetrofitService {
    @GET("book/search")
    Call<Book> getSearchBook(@Query("q") String name,
                             @Query("tag") String tag,
                             @Query("start") int start,
                             @Query("count") int count);
}
