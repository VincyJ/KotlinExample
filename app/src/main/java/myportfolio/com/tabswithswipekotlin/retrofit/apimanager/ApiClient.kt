package myportfolio.com.tabswithswipekotlin.retrofit.apimanager

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by arputha_v on 1/12/2018.
 */
class ApiClient {

    public var BASE_URL: String = "http://api.themoviedb.org/3/"
    public var retrofit: Retrofit? = null

    public fun getClient(): Retrofit? {
        if (retrofit == null) {
            retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
        return retrofit
    }
}