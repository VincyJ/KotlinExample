package myportfolio.com.tabswithswipekotlin.retrofit.adapter

import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_movie.view.*
import myportfolio.com.tabswithswipekotlin.R
import myportfolio.com.tabswithswipekotlin.retrofit.model.Movie

/**
 * Created by arputha_v on 1/16/2018.
 */
class MoviesAdapter(val movies: List<Movie>?) : RecyclerView.Adapter<MoviesAdapter.MovieHolder>() {

    override fun onBindViewHolder(holder: MovieHolder, position: Int) {
        val item = movies!![position]
        holder.bindMovie(item)
    }

    override fun getItemCount(): Int = movies!!.size

    override fun onCreateViewHolder(parent: ViewGroup?, p1: Int): MoviesAdapter.MovieHolder {
        val inflatedView = parent!!.inflate(R.layout.list_item_movie, false)
        return MovieHolder(inflatedView)
    }

    class MovieHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v
        private var movie: Movie? = null

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            println("Item clicked")
        }

        fun bindMovie(movie: Movie) {
            this.movie = movie
            view.title.text = movie.title
            view.subtitle.text = movie.releaseDate
            view.description.text = movie.overview
            view.rating.text = movie.voteAverage.toString()
        }

    }
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}
