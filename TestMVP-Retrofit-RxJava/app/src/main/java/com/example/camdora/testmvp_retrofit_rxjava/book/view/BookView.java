package com.example.camdora.testmvp_retrofit_rxjava.book.view;

import com.example.camdora.testmvp_retrofit_rxjava.BaseView;
import com.example.camdora.testmvp_retrofit_rxjava.book.bean.Book;

/**
 * Created by camdora on 17-11-21.
 */

public interface BookView extends BaseView {
    void onSuccess(Book book);
    void onError(String result);
}
