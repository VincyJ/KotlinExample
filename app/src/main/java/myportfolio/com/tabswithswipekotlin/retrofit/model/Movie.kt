package myportfolio.com.tabswithswipekotlin.retrofit.model

import com.google.gson.annotations.SerializedName
import java.util.*


/**
 * Created by arputha_v on 1/12/2018.
 */
class Movie {

    @SerializedName("poster_path")
    public var posterPath: String? = null
    @SerializedName("adult")
    public var adult: Boolean = false
    @SerializedName("overview")
    public var overview: String? = null
    @SerializedName("release_date")
    public var releaseDate: String? = null
    @SerializedName("genre_ids")
    public var genreIds: List<Int> = ArrayList()
    @SerializedName("id")
    public var id: Int? = null
    @SerializedName("original_title")
    public var originalTitle: String? = null
    @SerializedName("original_language")
    public var originalLanguage: String? = null
    @SerializedName("title")
    public var title: String? = null
    @SerializedName("backdrop_path")
    public var backdropPath: String? = null
    @SerializedName("popularity")
    public var popularity: Double? = null
    @SerializedName("vote_count")
    public var voteCount: Int? = null
    @SerializedName("video")
    public var video: Boolean? = null
    @SerializedName("vote_average")
    public var voteAverage: Double? = null
}