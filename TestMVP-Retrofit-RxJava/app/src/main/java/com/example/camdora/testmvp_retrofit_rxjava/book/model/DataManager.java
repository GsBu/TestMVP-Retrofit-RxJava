package com.example.camdora.testmvp_retrofit_rxjava.book.model;

import android.content.Context;

import com.example.camdora.testmvp_retrofit_rxjava.RetrofitService;
import com.example.camdora.testmvp_retrofit_rxjava.book.bean.Book;
import com.example.camdora.testmvp_retrofit_rxjava.utils.RetrofitHelper;

import rx.Observable;

/**
 * Created by camdora on 17-11-21.
 */

public class DataManager {
    private RetrofitService mRetrofitService;

    public DataManager(Context context){
        this.mRetrofitService = RetrofitHelper.getInstance(context).getServer();
    }

    public Observable<Book> getSearchBooks(String name, String tag, int start, int count){
        return mRetrofitService.getSearchBook(name,tag,start,count);
    }
}
