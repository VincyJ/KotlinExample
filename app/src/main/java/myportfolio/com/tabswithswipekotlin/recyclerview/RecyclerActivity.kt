package myportfolio.com.tabswithswipekotlin.recyclerview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*
import myportfolio.com.tabswithswipekotlin.R
import myportfolio.com.tabswithswipekotlin.recyclerview.adapter.RecyclerAdapter
import myportfolio.com.tabswithswipekotlin.recyclerview.model.Photo

class RecyclerActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: RecyclerAdapter
    var mImagelist = ArrayList<Photo>();

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        setSupportActionBar(recycler_toolbar)

        linearLayoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = linearLayoutManager


        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/CadillacRanch_HeroImage.jpg", "CadillacRanch", "Rich delicious food"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/CoffeeTeaLTD_TenantImage.jpg", "CoffeeTeaLTD", "Coffe + tea Area"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/Hooters_HeroImage.jpg", "Hooters", "Chicken chops"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/RockyMountainChocolateFactory_TenantImage.jpg", "RockyMountainChocolateFactory", "Rick cocoa chocolate"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/TigerSushi_TenantImage.jpg", "TigerSushi", "Chicken chops"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/NorthwoodsCandyEmporium_TenantImage.jpg", "NorthwoodsCandyEmporium", "Chicken chops"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/MagicPanCrepeStand_TenantImage.jpg", "MagicPanCrepeStand", "Chicken chops"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/LindtChocolate_HeroImage.jpg", "LindtChocolate", "Chicken chops"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/PandaExpress_TenantImage.jpg", "PandaExpress", "Chicken chops"))
        mImagelist.add(Photo("https://www.mallofamerica.com/sites/default/files/tenants/LongJohnSilvers_TenantImage.jpg", "LongJohnSilvers", "Chicken chops"))

        adapter = RecyclerAdapter(mImagelist)
        recycler_view.adapter = adapter

    }
}
