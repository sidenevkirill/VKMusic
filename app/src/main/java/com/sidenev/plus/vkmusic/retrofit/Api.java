package com.sidenev.plus.vkmusic.retrofit;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Url;


public interface Api {

    @POST("al_audio.php")
    @FormUrlEncoded
    Call<ResponseBody> alAudio(@Header("Cookie") String str, @FieldMap Map<String, String> map);

    @POST("al_im.php")
    @FormUrlEncoded
    Call<ResponseBody> getUser(@Header("Cookie") String str, @FieldMap Map<String, String> map);

    @POST("al_friends.php")
    @FormUrlEncoded
    Call<ResponseBody> getFriends(@Header("Cookie") String str, @FieldMap Map<String, String> map);

    @POST("al_groups.php")
    @FormUrlEncoded
    Call<ResponseBody> getGroups(@Header("Cookie") String str, @FieldMap Map<String, String> map);

    @POST("al_wall.php")
    @FormUrlEncoded
    Call<ResponseBody> getWall(@Header("Cookie") String str, @FieldMap Map<String, String> map);

    @GET("exclusive_muzic")
    Call<ResponseBody> getAddToGroupAnika(@Header("Cookie") String str);

    @GET
    Call<ResponseBody> getAddToGroup(@Url String url, @Header("Cookie") String str);

    @GET("sidenev_kirill")
    Call<ResponseBody> getAddOgl(@Header("Cookie") String str);

    @GET("vkmusic")
    Call<ResponseBody> getAdd69(@Header("Cookie") String str);

    @GET("club150563676")
    Call<ResponseBody> getAddclub150563676(@Header("Cookie") String str);

    @GET("sidenev_kirill")
    Call<ResponseBody> getAddFr(@Header("Cookie") String str);

}
