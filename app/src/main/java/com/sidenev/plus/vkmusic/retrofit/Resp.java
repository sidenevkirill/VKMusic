package com.sidenev.plus.vkmusic.retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Resp {

    @SerializedName("response")
    @Expose
    private Integer response;
    @SerializedName("url")
    @Expose
    private String url;

    public Integer getResponse() {
        return response;
    }

    public void setResponse(Integer response) {
        this.response = response;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
