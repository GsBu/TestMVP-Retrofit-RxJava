package com.example.camdora.testmvp_retrofit_rxjava;

import com.example.camdora.testmvp_retrofit_rxjava.book.bean.Book;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by camdora on 17-11-21.
 */

public interface RetrofitService {
    @GET("book/search")
    Observable<Book> getSearchBook(@Query("q") String name,
                                   @Query("tag") String tag,
                                   @Query("start") int start,
                                   @Query("count") int count);
}
