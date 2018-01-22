package myportfolio.com.tabswithswipekotlin.retrofit.model

import com.google.gson.annotations.SerializedName

/**
 * Created by arputha_v on 1/16/2018.
 */
class MoviesResponse {

    @SerializedName("page")
    private var page: Int = 0
    @SerializedName("results")
    public var results: List<Movie>? = null
    @SerializedName("total_results")
    private var totalResults: Int = 0
    @SerializedName("total_pages")
    private var totalPages: Int = 0

}