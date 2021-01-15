package com.sidenev.plus.vkmusic.retrofit;


import retrofit2.Call;
import retrofit2.http.GET;


public interface Api2 {

    @GET("/server/music/musvk_black_2505.php")
    Call<Resp> getFriends1();


}
