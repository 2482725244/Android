package com.example.testdemo.retrofit;

import com.example.testdemo.User;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

   @GET("url")
   Call<String> test(@Query("url") String str);

    @POST("url")
    @FormUrlEncoded
    Call<String> testPost(@Field("url") String str);

    @POST("url")
    @FormUrlEncoded
    Call<String> tt(@FieldMap Map<String,String> map);


    @POST("url")
    @FormUrlEncoded
    Call<ResponsData<String>> ttaa(@Body User user);


}
