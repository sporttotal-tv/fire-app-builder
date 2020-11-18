package com.amazon.dataloader.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class CMSService {

    private static CMSService CMSService;
    public CMSApi cmsApi;

    public static CMSService getInstance() {
        if (CMSService == null) {
            CMSService = new CMSService();
            CMSService.cmsApi = getCMSRetrofitInstance().create(CMSApi.class);
        }
        return CMSService;
    }

    private CMSService() {}

    private static Retrofit getCMSRetrofitInstance1()  {
        String BASE_URL = "https://dev-api.sporttotal.co/";
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().build())
                .build();
    }

    private static Retrofit getCMSRetrofitInstance()  {
        String BASE_URL = "https://www.sporttotal.tv/";
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().build())
                .build();
    }

}
