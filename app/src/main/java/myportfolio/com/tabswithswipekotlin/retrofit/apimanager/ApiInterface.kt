package myportfolio.com.tabswithswipekotlin.retrofit.apimanager

import myportfolio.com.tabswithswipekotlin.retrofit.model.MoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * Created by arputha_v on 1/12/2018.
 */
interface ApiInterface {

    @GET("movie/top_rated")
    fun getTopRatedMovies(@Query("api_key") apiKey: String): Call<MoviesResponse>

    @GET("movie/{id}")
    fun getMovieDetails(@Path("id") id: Int, @Query("api_key") apiKey: String): Call<MoviesResponse>
}