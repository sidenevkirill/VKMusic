package com.sidenev.plus.vkmusic;

import com.sidenev.plus.vkmusic.retrofit.Api;
import com.sidenev.plus.vkmusic.retrofit.Api2;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKAccessTokenTracker;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class Application extends android.app.Application {

    private static Api umoriliApi;
    private static Api2 umoriliApi2;
    private Retrofit retrofit, retrofit2;

    VKAccessTokenTracker vkAccessTokenTracker = new VKAccessTokenTracker() {
        @Override
        public void onVKAccessTokenChanged(VKAccessToken oldToken, VKAccessToken newToken) {
//            if (newToken == null) {
//                Toast.makeText(Application.this, "AccessToken invalidated", Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(Application.this, LoginActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                startActivity(intent);
//            }else startActivity(new Intent(Application.this, MainActivity.class));
        }
    };
    @Override
    public void onCreate() {
        super.onCreate();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://vk.com") //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        umoriliApi = retrofit.create(Api.class);

        retrofit2 = new Retrofit.Builder()
                .baseUrl("https://anika-cs.by/") //Базовая часть адреса
                .addConverterFactory(GsonConverterFactory.create()) //Конвертер, необходимый для преобразования JSON'а в объекты
                .build();
        umoriliApi2 = retrofit2.create(Api2.class);

        //String[] fingerprints = VKUtil.getCertificateFingerprint(this, this.getPackageName());

        //vkAccessTokenTracker.startTracking();
        //VKSdk.initialize(this);
    }

    public static Api getApi() {
        return umoriliApi;
    }

    public static Api2 getApi2() {
        return umoriliApi2;
    }

}