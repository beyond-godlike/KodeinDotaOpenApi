package com.unava.dia.kodeindotaopenapi.di

import android.app.Application
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class App : Application(), KodeinAware {
    val BASE_URL = "https://api.opendota.com/api/"

    override val kodein by Kodein.lazy {

        // provide retrofit
        bind<Retrofit>() with singleton {
            Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        }
    }

    override fun onCreate() {
        super.onCreate()

    }
}