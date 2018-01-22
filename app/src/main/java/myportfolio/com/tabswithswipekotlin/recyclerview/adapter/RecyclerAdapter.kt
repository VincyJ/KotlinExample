package myportfolio.com.tabswithswipekotlin.recyclerview.adapter


import android.support.annotation.LayoutRes
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.layout_recycler_item_row.view.*
import myportfolio.com.tabswithswipekotlin.R
import myportfolio.com.tabswithswipekotlin.recyclerview.model.Photo

/**
 * Created by arputha_v on 1/10/2018.
 */
class RecyclerAdapter(val photos: ArrayList<Photo>) : RecyclerView.Adapter<RecyclerAdapter.PhotoHolder>() {


    override fun onBindViewHolder(holder: PhotoHolder, position: Int) {
        val item = photos[position]
        holder.bindPhoto(item)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, p1: Int): PhotoHolder {
        val inflatedView = parent!!.inflate(R.layout.layout_recycler_item_row, false)
        return PhotoHolder(inflatedView)
    }

    override fun getItemCount() = photos.size

    class PhotoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {

        private var view: View = v
        private var photo: Photo? = null

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(p0: View?) {
            println("Item clicked")
        }

        fun bindPhoto(photo: Photo) {
            this.photo = photo
            Picasso.with(view.context).load(photo.imageUrl).into(view.iv_pic)

            view.tv_name.text = photo.itemName
            view.tv_description.text = photo.itemDescription

//            Glide.with(view.context).load(photo.imageUrl).into(view.iv_pic)
        }
    }

    fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }


}