package com.example.camdora.testmvp_retrofit_rxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.camdora.testmvp_retrofit_rxjava.model.Book;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.douban.com/v2/")
                .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().create()))
                .build();

        text = (TextView)findViewById(R.id.tv_1);

        RetrofitService service = retrofit.create(RetrofitService.class);
        Call<Book> call =  service.getSearchBook("金瓶梅", null, 0, 1);
        call.enqueue(new Callback<Book>() {
            @Override
            public void onResponse(Call<Book> call, Response<Book> response) {
                text.setText(response.body()+"");
            }
            @Override
            public void onFailure(Call<Book> call, Throwable t) {
            }
        });
    }
}
