package com.example.camdora.testmvp_retrofit_rxjava;

import android.content.Intent;

/**
 * Created by camdora on 17-11-21.
 */

public interface BasePresenter {

    void onCreate();

    void onStart();//暂时没用到

    void onPause();//暂时没用到

    void onStop();

    void onDestroy();

    void attachView(BaseView view);

    void attachIncomingIntent(Intent intent);//暂时没用到
}