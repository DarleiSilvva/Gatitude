package vm.caatsoft.gatitude.presenter.di

import okhttp3.OkHttpClient
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import vm.caatsoft.gatitude.data.CatDataRepository
import vm.caatsoft.gatitude.data.remote.api.CatApi
import vm.caatsoft.gatitude.domain.CatRepository

/**
 * Teste Stefanini
 * @author Darlei Silva
 * Criado em 20/04/2022
 */

val networkModule = module {
    factory {
        CatDataRepository(catApi = get()) as CatRepository
    }

    single {
        val baseCatApi = "https://api.thecatapi.com/"

        Retrofit.Builder().client(OkHttpClient())
            .baseUrl(baseCatApi)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
    }

    single {
        get<Retrofit>().create(CatApi::class.java)
    }
}