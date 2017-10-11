package com.raywenderlich.android.deezfoodz.dagger;

import com.raywenderlich.android.deezfoodz.app.Constants;
import com.raywenderlich.android.deezfoodz.network.UsdaApi;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by sai on 11/10/2017.
 */
@Module
public class NetworkModule {
    private static final String NAME_BASE_URL = "NAME_BASE_URL";

    @Provides
    Converter.Factory provideGsonConverter(){
        return  GsonConverterFactory.create().create();
    }

    @Provides
    @Named(NAME_BASE_URL)
    String provideUrlString(){
        return Constants.BASE_URL;
    }
    @Provides
    @Singleton
    Retrofit provideRetrofit(Converter.Factory converter,@Named(NAME_BASE_URL) String baseUrl){
        return new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(converter)
                .build();
    }
    @Provides
    @Singleton
    UsdaApi provideUsdaApi(Retrofit retrofit) {
        return retrofit.create(UsdaApi.class);
    }
}
