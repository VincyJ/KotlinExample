package myportfolio.com.tabswithswipekotlin.retrofit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_retrofit.*
import myportfolio.com.tabswithswipekotlin.R
import myportfolio.com.tabswithswipekotlin.retrofit.adapter.MoviesAdapter
import myportfolio.com.tabswithswipekotlin.retrofit.apimanager.ApiClient
import myportfolio.com.tabswithswipekotlin.retrofit.apimanager.ApiInterface
import myportfolio.com.tabswithswipekotlin.retrofit.model.MoviesResponse
import retrofit2.Callback

class RetrofitActivity : AppCompatActivity() {

    var TAG: String = RetrofitActivity::class.java.simpleName
    var API_KEY: String = "7e8f60e325cd06e164799af1e317d7a7"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_retrofit)

        setSupportActionBar(retrofit_toolbar)
        if (API_KEY.isEmpty()) {
            Toast.makeText(this, "Please obtain your API KEY from themoviedb.org first!", Toast.LENGTH_SHORT).show()
            return
        }

        movies_recycler_view.layoutManager = LinearLayoutManager(this)

        val apiService: ApiInterface = ApiClient().getClient()!!.create(ApiInterface::class.java)

        val call = apiService.getTopRatedMovies(API_KEY)
        call.enqueue(object : Callback<MoviesResponse> {
            override fun onResponse(call: retrofit2.Call<MoviesResponse>, response: retrofit2.Response<MoviesResponse>) {
                try {

                    val movies = response.body().results
                    movies_recycler_view.adapter = (MoviesAdapter(movies))
                } catch (e: Exception) {
                    Log.e(TAG, e.toString())
                }
            }

            override fun onFailure(call: retrofit2.Call<MoviesResponse>, t: Throwable) {
                // Log error here since request failed
                Log.e(TAG, t.toString())
            }
        })

    }
}
